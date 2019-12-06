package com.example.sismos;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SismosApplicationTests {

	@Autowired
	private SismosServiceImpl sismosService;
	@Test
	void contextLoads() {
	}
	
	@Test
	public void sismosByPaisTest() {
		//Pruebo por sismos en un pais no existente, deberían haber 0
		List<Feature> noSismos = sismosService.getSismosByPais("NOEXISTENTE");
		assertEquals(0, noSismos.size());
		//Pruebo por sismos en Italia, deberían no haber 0
		List<Feature> sismosItalia = sismosService.getSismosByPais("Italy");
		assertNotEquals(0, sismosItalia.size());
	}
	
	@Test
	public void getSismosByDate() {
		//Pruebo por fecha mal ingresada para traer sismos, haber 0
		List<Feature> noSismos = sismosService.getSismosByDate("01-10-2019");
		assertEquals(0, noSismos.size());
		//Pruebo por fecha de sismos sin completar, deberían haber 0
		List<Feature> NoSismos = sismosService.getSismosByDate("yyyy-MM-dd");
		assertNotEquals(0, NoSismos.size());
		//Pruebo por fecha completa y bien formateada, deberían no haber 0
		List<Feature> siSismos = sismosService.getSismosByDate("2019-10-02");
		assertNotEquals(0, siSismos.size());
	}
	
	@Test
	public void getSismosByDateTest() {
		//pruebo si algunas de las fechas es acertada sin nulos.
		Sismos response = sismosService.getSismosByDateTest("date1", "date2");
		// trae respuesta que no es nula 
		Assertions.assertNotNull(response);
		//se asigna a la respuesta una lista de features
		Assertions.assertEquals("feature", response.getType().getFeaturesCollection());
	}
	
	@Test
	public void getSismosByTwoDateRanges() {
		//pruebo si las fechas quedan mal ingresadas y al cruzar los rangos inicio con inicio y termino 
		//con termino trae mal menos sismos. 
		Sismos responseURL_1= sismosService.getSismosByTwoDateRanges("dateInicioRango_1", "dateInicioRango_2");
		Sismos responseURL_2= sismosService.getSismosByTwoDateRanges("dateTerminoRango_1", "dateTerminoRango_2");
		Assertions.assertNull(responseURL_1 + responseURL_2);
		//pruebo si las fechas bien ingresadas y al establecer conforme los rangos inicio con inicio y termino 
		//trae cantidad real de ambos rangos de sismos.
		Sismos responseURL_1= sismosService.getSismosByTwoDateRanges("dateInicioRango_1", "dateTerminoRango_1");
		Sismos responseURL_2= sismosService.getSismosByTwoDateRanges("dateInicioRango_2", "dateTerminoRango_2");
		assertNotEquals(0, responseURL_1.size());
		assertNotEquals(0, responseURL_2.size());
	}
	
	@Test
	public void getSismosByMagnitude() {
		//pruebo si algunas de las magnitudes es nula por traer la maxima primero en vez de la mínima.
		Sismos response = sismosService.getSismosByMagnitude("maxMag","minMag");
		// trae respuesta que no es nula 
		Assertions.assertNotNull(response);
		//se asigna a la respuesta una lista magitudes de features
		Assertions.assertEquals("feature", response.getType().getFeaturesCollection());
	}
	public Sismos getSismosByMagnitude(String minMagnitude, String maxMagnitude) {
		String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&minmagnitude={0}&maxmagnitude={1}";
		return restTemplate.getForObject(MessageFormat.format(url, minMagnitude, maxMagnitude), Sismos.class);
	}
	
	@Test
	public void getSismosByHoldDatesRanges() {
		//Pruebo por fechas establecidas sean las que se indicaron entre 01-10-2019","03-10-2019 y "06-10-2019","14-10-2019"
		List<Feature> responseRangofechaFija1 = sismosService.getSismosByHoldDatesRanges("01-10-2019","03-10-2019");
		List<Feature> responseRangofechaFija1 = sismosService.getSismosByHoldDatesRanges("06-10-2019","14-10-2019");
		assertTrue("los parametros de entrada son correctos", true);
		//prueba para ver que las fechas no son las indicadas 
		List<Feature> responseRangofechaFija1 = sismosService.getSismosByHoldDatesRanges("11-02-2019","13-02-2019");
		List<Feature> responseRangofechaFija1 = sismosService.getSismosByHoldDatesRanges("15-10-2019","16-10-2019");
		assertTrue("los parametros de entrada son incorrectos", false);
	
	@Test
	public void sismosByPaisTest() {
		//Pruebo por sismos en un pais no existente, deberían haber 0
		List<Feature> noSismos = sismosService.sismosByPaisTest("NOEXISTENTE");
		assertEquals(0, noSismos.size());
		//Pruebo por sismos en Italia, deberían no haber 0
		List<Feature> sismosChile = sismosService.sismosByPaisTest("Italy");
		assertNotEquals(0, sismosChile.size());
	}
	@Test
	public void getSismosByTwoDatesAndTwoCountries() {
		sismosService.getSismosByTwoDatesAndTwoCountries(String pais1, String pais2, String fecha1, String fecha2) {
		Sismos sismos = restTemplate.getForObject(MessageFormat.format(url, "yyy-MM-dd", "02-10-2019"), Sismos.class);
			assertEquals(0,sismos.lenght)//responde cero o null
		List<Feature> sismos1 = sismos.getFeatures().parallelStream()//pais 1 puede contener algunas letras
				.filter(f -> f.getProperties().getPlace().contains(", " + col)).collect(Collectors.toList());
		List<Feature> sismos2 = sismos.getFeatures().parallelStream()//pais 2 puede contener algunas letras
				.filter(f -> f.getProperties().getPlace().contains(", " + chi)).collect(Collectors.toList());
		List<Feature> sismoTotal = new ArrayList<Feature>();
		sismoTotal.addAll(sismos1);
			assertEquals(0,sismos1.size);//responde cero o null
		sismoTotal.addAll(sismos2);
			assertEquals(0,sismos2.size);//responde cero o null
		return assertEquals(0,sismoTotal=sismo+sismo1+sismo2);
			
		
}
