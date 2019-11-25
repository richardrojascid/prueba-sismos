package com.example.sismos.model;

public class Type {
	private String featuresCollection="featuresCollection";

	
	/**Constructor
	 * 
	 */
	public Type() {
	}

	/**
	 * Constructor with parameters
	 * @param featuresCollection
	 */
	public Type(String featuresCollection) {
		this.featuresCollection = featuresCollection;
	}

	/**
	 * Getters, Setters and ToString 
	 * @return
	 */
	public String getFeaturesCollection() {
		return featuresCollection;
	}

	public void setFeaturesCollection(String featuresCollection) {
		this.featuresCollection = featuresCollection;
	}

	@Override
	public String toString() {
		return "Type [featuresCollection=" + featuresCollection + "]";
	}
	
	
}
