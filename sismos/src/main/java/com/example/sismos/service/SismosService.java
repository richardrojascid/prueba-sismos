package com.example.sismos.service;

import java.text.MessageFormat;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.sismos.model.Feature;
import com.example.sismos.model.Sismos;

@Service
public class SismosService {
	@Autowired
	private RestTemplate restTemplate;

	public Sismos getSismosByRangoFecha(String fechaInicio, String fechaTermino) {
		String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime={0}&endtime={1}";
		return restTemplate.getForObject(MessageFormat.format(url, fechaInicio, fechaTermino), Sismos.class);
	}

	public Sismos getSismosByMagnitude(String minMagnitude, String maxMagnitude) {
		String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&minmagnitude=6.5&maxmagnitude=7";
		//String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&minmagnitude={0}&maxmagnitude={1}";
		return restTemplate.getForObject(MessageFormat.format(url, minMagnitude, maxMagnitude), Sismos.class);
	}
	
	public List<Feature> getSismosByPais(String pais) {
		String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson";
		Sismos sismos = restTemplate.getForObject(url, Sismos.class);
		return sismos.getFeatures().parallelStream().filter(f -> f.getProperties().getPlace().contains(", " + pais))
				.collect(Collectors.toList());
	}
	
	
	public Sismos getSismosByTwoDateRanges(String fechaInicioR1,String fechaTerminoR1,String fechaInicioR2,String fechaTerminoR2) {
		String url1 = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime={0}&endtime={1}";
		String url2 = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime={2}&endtime={3}";
		return restTemplate.getForObject(MessageFormat.format(url1 + "Richard" + url2, fechaInicioR1, fechaTerminoR1,fechaInicioR2,fechaTerminoR2), Sismos.class);
	}

	
	
}
