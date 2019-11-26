package com.example.sismos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sismos.model.Sismos;
import com.example.sismos.service.SismosServiceImpl;

@RestController
@RequestMapping("sismos")
public class SismosController {

	/**
	 * sismosService: se injecta este Servicio para obtener la información de la URL
	 * de sismos del API en la WEB y asi poder retornar esta informacion en la URL
	 * local de cada método del EndPoint local.
	 * 
	 * @param pais
	 * @return
	 */

	@Autowired
	private SismosServiceImpl sismosService;

	/**
	 * Método mediante servicio sismosService y publica la información de sismos por
	 * fechas en el EndPoit local.
	 * 
	 * @param fechaInicio
	 * @param fechaTermino
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/buscar/fechas/{fecha1}/{fecha2}")
	public ResponseEntity<?> sismosPorFecha(@PathVariable(name = "fecha1") String fecha1,
			@PathVariable(name = "fecha2") String fecha2) {
		return new ResponseEntity<Sismos>(sismosService.getSismosByDate(fecha1, fecha2), HttpStatus.OK);
	}

	/**
	 * Método publica la información de sismos con dos magnitudes en el EndPoint
	 * local.
	 * 
	 * @param minMagnitud
	 * @param maxMagnitud
	 * @return: Información de sismos por dos magnitudes.
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/buscar/magnitudes/{minMagnitud}/{maxMagnitud}")
	public ResponseEntity<?> getSismosByMagnitude(@PathVariable(name = "minMagnitud") String minMagnitud,
			@PathVariable(name = "maxMagnitud") String maxMagnitud) {
		return new ResponseEntity<Sismos>(sismosService.getSismosByMagnitude(minMagnitud, maxMagnitud), HttpStatus.OK);
	}

	/**
	 * Método mediante servicio sismosService publica la información de sismos por
	 * País en el EndPoint local.
	 * 
	 * @param pais
	 * @return: Información de sismos por País.
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/buscar/pais/{pais}")
	public ResponseEntity<?> sismosPorPais(@PathVariable(name = "pais") String pais) {
		return new ResponseEntity<>(sismosService.getSismosByPais(pais), HttpStatus.OK);
	}

	/**
	 * resultados por rango de 4 fechas 2 de inicio y dos de termino
	 * 
	 * @param fechaInicioR1
	 * @param fechaTerminoR1
	 * @param fechaInicioR2
	 * @param fechaTerminoR2
	 * @return todos los sismos por rangos
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/buscar/Dosfechas/{fechaInicioR1}/{fechaTerminoR1}/{fechaInicioR2}/{fechaTerminoR2}")
	public ResponseEntity<?> getSismosByTwoDateRanges(@PathVariable(name = "fechaInicioR1") String fechaInicioR1,
			@PathVariable(name = "fechaTerminoR1") String fechaTerminoR1,
			@PathVariable(name = "fechaInicioR2") String fechaInicioR2,
			@PathVariable(name = "fechaTerminoR2") String fechaTerminoR2) {
		return new ResponseEntity<Sismos>((Sismos) sismosService.getSismosByTwoDateRanges(fechaInicioR1, fechaTerminoR1,
				fechaInicioR2, fechaTerminoR2), HttpStatus.OK);
	}

	/**
	 * {INICIO_FECHA_1}/{TERMINO_FECHA_1}/{INICIO_FECHA_2}/{TERMINO_FECHA_2}
	 * 
	 * @param sismo
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, path = "/buscar/sismosPorRangoDeMesFijo")
	public ResponseEntity<?> getSismosByHoldDatesRanges(@RequestBody Sismos sismo) {
		return new ResponseEntity<Sismos>(sismosService.getSismosByHoldDatesRanges(), HttpStatus.OK);
	}

	/**
	 * End point que publica el conteo de sismos por dos paises en dos fechas
	 * 
	 * @param pais1
	 * @param pais2
	 * @param fecha1
	 * @param fecha2
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/buscar/CountByDatesAndCountries/{pais1}/{pais2}/{fecha1}/{fecha2}")
	public ResponseEntity<?> getSismosByTwoDatesAndTwoCountries(@PathVariable(name = "pais1") String pais1,
			@PathVariable(name = "pais2") String pais2, @PathVariable(name = "fecha1") String fecha1,
			@PathVariable(name = "fecha2") String fecha2) {
		return new ResponseEntity<>(sismosService.getSismosByTwoDatesAndTwoCountries(pais1, pais2, fecha1, fecha2),
				HttpStatus.OK);
	}

}
