package com.example.sismos.model;

import java.util.List;

public class Geometry {
	private String type;
	private List<Coordinate> coordinantes;
	
	
	/**Constructor
	 * 
	 */
	public Geometry() {
	}

	/**Constructor with parameters
	 * 
	 * @param type
	 * @param coordinantes
	 */
	
	public Geometry(String type, List<Coordinate> coordinantes) {
		this.setType(type);
		this.coordinantes = coordinantes;
		
	}
	
	/**Getters, Setters and ToString
	 * 
	 * @return
	 */
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public List<Coordinate> getCoordinantes() {
		return coordinantes;
	}
	
	public void setCoordinantes(List<Coordinate> coordinantes) {
		this.coordinantes = coordinantes;
	}

	
}
