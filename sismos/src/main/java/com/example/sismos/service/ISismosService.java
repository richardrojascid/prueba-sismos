package com.example.sismos.service;

import java.util.List;
import com.example.sismos.model.Feature;
import com.example.sismos.model.Sismos;

public interface ISismosService {

	public Sismos getSismosByDate(String fecha1, String fecha2);
	public Sismos getSismosByMagnitude(String minMagnitude, String maxMagnitude);
	public Sismos getSismosByTwoDateRanges(String fechaInicioR1,String fechaTerminoR1,String fechaInicioR2,String fechaTerminoR2);
	public Sismos getSismosByHoldDatesRanges();
	public List<Feature> getSismosByPais(String pais);
	public int getSismosByTwoDatesAndTwoCountries(String pais1, String pais2, String fecha1,String fecha2);
}
