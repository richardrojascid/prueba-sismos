package com.example.sismos.service;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.sismos.constans.Constants;
import com.example.sismos.model.Feature;
import com.example.sismos.model.Sismos;

@Service
public class SismosServiceImpl implements Constants {
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * Exponer endpoint para recibir 2 fechas, este se debe comunicar con un
	 * servicio que obtiene el detalle de los sismos entre los días pasados como
	 * parámetros.
	 * 
	 * @param fechaInicio
	 * @param fechaTermino
	 * @return simos entre dos fechas
	 */
	public Sismos getSismosByDate(String fecha1, String fecha2) {
		String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime={0}&endtime={1}";
		return restTemplate.getForObject(MessageFormat.format(url, fecha1, fecha2), Sismos.class);
	}

	/**
	 * Exponer endpoint que reciba dos magnitudes, el cual se debe comunicar con un
	 * servicio que obtiene el detalle de los sismos que se encuentran entre dichas
	 * magnitudes
	 * 
	 * @param minMagnitude
	 * @param maxMagnitude
	 * @return sismos entre dos magnitudes
	 */
	public Sismos getSismosByMagnitude(String minMagnitude, String maxMagnitude) {
		String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&minmagnitude={0}&maxmagnitude={1}";
		return restTemplate.getForObject(MessageFormat.format(url, minMagnitude, maxMagnitude), Sismos.class);
	}

	/**
	 * Exponer un endpoint que reciba 4 fechas, el cual se debe comunicar con un
	 * servicio que entregue los sismos ocurridos entre dichos rangos
	 * 
	 * @param fechaInicioR1
	 * @param fechaTerminoR1
	 * @param fechaInicioR2
	 * @param fechaTerminoR2
	 * @return
	 */
	public Sismos getSismosByTwoDateRanges(String fechaInicioR1, String fechaTerminoR1, String fechaInicioR2,
			String fechaTerminoR2) {
		String url1 = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime={0}&endtime={1}";
		String url2 = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime={2}&endtime={3}";
		return restTemplate.getForObject(
				MessageFormat.format(url1 + " / " + url2, fechaInicioR1, fechaTerminoR1, fechaInicioR2, fechaTerminoR2),
				Sismos.class);
	}

	/**
	 * Se deben obtener los sismos ocurridos entre el 1 y 3 de Octubre más los
	 * ocurridos entre el 6 y 14 de Octubre.
	 * 
	 * @param minMagnitudeR1
	 * @param maxMagnitudeR1
	 * @param minMagnitudeR2
	 * @param maxMagnitudeR2
	 * @return los sismos que se encuentran entre estas dos rangos de fechas
	 */

	public Sismos getSismosByHoldDatesRanges() {
		String url1 = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime={0}&endtime={1}";
		String url2 = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime={2}&endtime={3}";
		return restTemplate.getForObject(MessageFormat.format(url1 + " / " + url2, INICIO_FECHA_1, TERMINO_FECHA_1,
				INICIO_FECHA_2, TERMINO_FECHA_2), Sismos.class);
	}

	/**
	 * Exponer un endpoint para recibir un país como parámetro, el cual se debe
	 * comunicar con un servicio que filtra todos los sismos y los retorna.
	 * 
	 * @param pais
	 * @return sismos por pais
	 */
	public List<Feature> getSismosByPais(String pais) {
		String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson";
		Sismos sismos = restTemplate.getForObject(url, Sismos.class);
		return sismos.getFeatures().parallelStream().filter(f -> f.getProperties().getPlace().contains(", " + pais))
				.collect(Collectors.toList());
	}

	/**
	 * Exponer endpoint para recibir 2 países y dos fechas, se debe comunicar con un
	 * servicio para contar la cantidad de sismos ocurridos en los datos que cumplan
	 * con los parámetros dados.
	 * 
	 * @param pais1
	 * @param pais2
	 * @param fecha1
	 * @param fecha2
	 * @return conteo de sismos totales filtrados por fechas y paises
	 */
	public int getSismosByTwoDatesAndTwoCountries(String pais1, String pais2, String fecha1, String fecha2) {
		String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson";
		Sismos sismos = restTemplate.getForObject(MessageFormat.format(url, fecha1, fecha2), Sismos.class);
		List<Feature> sismos1 = sismos.getFeatures().parallelStream()
				.filter(f -> f.getProperties().getPlace().contains(", " + pais1)).collect(Collectors.toList());
		List<Feature> sismos2 = sismos.getFeatures().parallelStream()
				.filter(f -> f.getProperties().getPlace().contains(", " + pais2)).collect(Collectors.toList());
		List<Feature> sismoTotal = new ArrayList<Feature>();
		sismoTotal.addAll(sismos1);
		sismoTotal.addAll(sismos2);

		return sismoTotal.size();

	}

}
