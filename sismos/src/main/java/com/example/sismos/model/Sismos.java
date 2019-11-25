package com.example.sismos.model;

import java.util.List;

public class Sismos {
	private Type type;
	private Metadata metadata;
	private List<Feature> features;
	private List<Double> bbox;
		
	/**Constructor
	 * 
	 */
	public Sismos() {
	}

	
	/**Getters, Setters and ToString
	 * 
	 * @return
	 */
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}


	public List<Feature> getFeatures() {
		return features;
	}


	public void setFeatures(List<Feature> features) {
		this.features = features;
	}


	public List<Double> getBbox() {
		return bbox;
	}


	public void setBbox(List<Double> bbox) {
		this.bbox = bbox;
	}


	@Override
	public String toString() {
		return "Prueba [type=" + type + ", metadata=" + metadata + ", features=" + features + ", bbox=" + bbox + "]";
	}


	

	
	
}
