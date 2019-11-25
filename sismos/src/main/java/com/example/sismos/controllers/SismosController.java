package com.example.sismos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sismos.model.Sismos;
import com.example.sismos.service.SismosService;

@RestController
@RequestMapping("sismos")
public class SismosController {
	
	/**
	 * sismosService: se injecta este Servicio para obtener la información de la URL de sismos del API en la WEB
	 * y asi poder retornar esta informacion en la URL local de cada método del EndPoint local.
	 * @param pais
	 * @return
	 */
		 
	@Autowired
	private SismosService sismosService;
	
	
	/**
	 * Método que consume el EndPoint WEB mediante servicio sismosService y publica la información de sismos
	 * por fechas en el EndPoit local.
	 * @param fechaInicio
	 * @param fechaTermino
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/buscar/fechas/{fechaInicio}/{fechaTermino}")
	public ResponseEntity<?> sismosPorRangoFecha(@PathVariable(name = "fechaInicio") String fechaInicio,
												 @PathVariable(name = "fechaTermino") String fechaTermino) {
		return new ResponseEntity<Sismos>(sismosService.getSismosByRangoFecha(fechaInicio, fechaTermino),
				HttpStatus.OK);
	}
	
	/**
	 * Método que consume el EndPoint WEB, mediante servicio sismosService y publica la información de sismos
	 * con dos magnitudes en el EndPoint local.
	 * @param minMagnitud
	 * @param maxMagnitud
	 * @return: Información de sismos por dos magnitudes.
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/buscar/magnitudes/{minMagnitud}/{maxMagnitud}")
	public ResponseEntity<?> getSismosByMagnitude(@PathVariable(name = "minMagnitud") String minMagnitud,
											   @PathVariable(name = "maxMagnitud") String maxMagnitud) {
		return new ResponseEntity<Sismos>(sismosService.getSismosByMagnitude(minMagnitud, maxMagnitud),
				HttpStatus.OK);
	}

	/**
	 * Método que consume el EndPoint WEB, mediante servicio sismosService y publica la información de sismos
	 * por País en el EndPoint local.
	 * @param pais
	 * @return: Información de sismos por País.
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/buscar/pais/{pais}")
	public ResponseEntity<?> sismosPorPais(@PathVariable(name = "pais") String pais) {
		return new ResponseEntity<>(sismosService.getSismosByPais(pais), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/buscar/Dosfechas/{fechaInicioR1}/{fechaTerminoR1}/{fechaInicioR2}/{fechaTerminoR2}")
	public ResponseEntity<?> getSismosByTwoDateRanges(@PathVariable(name = "fechaInicioR1") String fechaInicioR1,
												  	  @PathVariable(name = "fechaTerminoR1") String fechaTerminoR1,
												  	  @PathVariable(name = "fechaInicioR2") String fechaInicioR2,
												  	  @PathVariable(name = "fechaTerminoR2") String fechaTerminoR2) {
		return new ResponseEntity<Sismos>((Sismos) sismosService.getSismosByTwoDateRanges(fechaInicioR1, fechaTerminoR1,fechaInicioR2,fechaTerminoR2),
				HttpStatus.OK);
	}
}
