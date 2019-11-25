package com.example.sismos.model;

public class Feature {
	
	private String type;
	private Property properties; 
	/*Double mag,String place,Long time,Long update,Integer tz,String url,String detail,String felt,String cdi,String mmi,String alert,String status,Integer tsunami,Integer sig,String net,String code,String ids,String sources,String types,Integer nst,Double dmin,Double rms,Integer gap,String magType,String type,String tittle*/
	private Geometry geometry; //String type,List coordinantes
	private String id;
	
	/**Constructor
	 * 
	 */
	public Feature() {
	}
	
	/**Constructor with parameters
	 * 	
	 * @param type
	 * @param properties
	 * @param geometry
	 * @param id
	 */
	public Feature(String type, Property properties, Geometry geometry, String id) {
		this.type = type;
		this.properties = properties;
		this.geometry = geometry;
		this.id = id;
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
	public Property getProperties() {
		return properties;
	}
	public void setProperties(Property properties) {
		this.properties = properties;
	}
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Producto [type=" + type + ", properties=" + properties + ", geometry=" + geometry + ", id=" + id + "]";
	}



}
