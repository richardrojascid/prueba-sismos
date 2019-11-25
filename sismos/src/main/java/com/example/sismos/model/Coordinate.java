package com.example.sismos.model;

public class Coordinate {
	private Double coordinate;

	/**Constructor
	 * 
	 */
	public Coordinate() {
	}

	/**Constructor with parameters
	 * 
	 * @param coordinate
	 */

	public Coordinate(Double coordinate) {
		this.coordinate = coordinate;
	}
	
	/**Getters, Setters and ToString
	 * 
	 * @return
	 */
	public Double getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Double coordinate) {
		this.coordinate = coordinate;
	}

	@Override
	public String toString() {
		return "Coordinate [coordinate=" + coordinate + "]";
	}
	
	
	
	
	
}
