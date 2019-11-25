package com.example.sismos.model;

public class Property {
	private Double mag;
	private String place;
	private Long time;
	private Long update;
	private Integer tz;
	private String url;
	private String detail;
	private String felt;
	private String cdi;
	private String mm;
	private String alert;
	private String status;
	private Integer tsunami;
	private Integer sig;
	private String net;
	private String code;
	private String ids;
	private String sources;
	private String types;
	private Integer nst;
	private Double dmin;
	private Double rms;
	private Integer gap;
	private String magType;
	private String type;
	private String title;
	
	/**
	 * Constructor
	 */
	public Property() {
	}


	/**Constructor with Parameters
	 * 
	 * @param mag
	 * @param place
	 * @param time
	 * @param update
	 * @param tz
	 * @param url
	 * @param detail
	 * @param felt
	 * @param cdi
	 * @param mm
	 * @param alert
	 * @param status
	 * @param tsunami
	 * @param sig
	 * @param net
	 * @param code
	 * @param ids
	 * @param sources
	 * @param types
	 * @param nst
	 * @param dmin
	 * @param rms
	 * @param gap
	 * @param magType
	 * @param type
	 * @param title
	 */
	public Property(Double mag, String place, Long time, Long update, Integer tz, String url, String detail,
			String felt, String cdi, String mm, String alert, String status, Integer tsunami, Integer sig, String net,
			String code, String ids, String sources, String types, Integer nst, Double dmin, Double rms, Integer gap,
			String magType, String type, String title) {
		this.mag = mag;
		this.place = place;
		this.time = time;
		this.update = update;
		this.tz = tz;
		this.url = url;
		this.detail = detail;
		this.felt = felt;
		this.cdi = cdi;
		this.mm = mm;
		this.alert = alert;
		this.status = status;
		this.tsunami = tsunami;
		this.sig = sig;
		this.net = net;
		this.code = code;
		this.ids = ids;
		this.sources = sources;
		this.types = types;
		this.nst = nst;
		this.dmin = dmin;
		this.rms = rms;
		this.gap = gap;
		this.magType = magType;
		this.type = type;
		this.title = title;
	}

	/**Getters, Setters and ToString
	 * 
	 * @return
	 */
	public Double getMag() {
		return mag;
	}


	public void setMag(Double mag) {
		this.mag = mag;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public Long getTime() {
		return time;
	}


	public void setTime(Long time) {
		this.time = time;
	}


	public Long getUpdate() {
		return update;
	}


	public void setUpdate(Long update) {
		this.update = update;
	}


	public Integer getTz() {
		return tz;
	}


	public void setTz(Integer tz) {
		this.tz = tz;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	public String getFelt() {
		return felt;
	}


	public void setFelt(String felt) {
		this.felt = felt;
	}


	public String getCdi() {
		return cdi;
	}


	public void setCdi(String cdi) {
		this.cdi = cdi;
	}


	public String getMm() {
		return mm;
	}


	public void setMm(String mm) {
		this.mm = mm;
	}


	public String getAlert() {
		return alert;
	}


	public void setAlert(String alert) {
		this.alert = alert;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Integer getTsunami() {
		return tsunami;
	}


	public void setTsunami(Integer tsunami) {
		this.tsunami = tsunami;
	}


	public Integer getSig() {
		return sig;
	}


	public void setSig(Integer sig) {
		this.sig = sig;
	}


	public String getNet() {
		return net;
	}


	public void setNet(String net) {
		this.net = net;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getIds() {
		return ids;
	}


	public void setIds(String ids) {
		this.ids = ids;
	}


	public String getSources() {
		return sources;
	}


	public void setSources(String sources) {
		this.sources = sources;
	}


	public String getTypes() {
		return types;
	}


	public void setTypes(String types) {
		this.types = types;
	}


	public Integer getNst() {
		return nst;
	}


	public void setNst(Integer nst) {
		this.nst = nst;
	}


	public Double getDmin() {
		return dmin;
	}


	public void setDmin(Double dmin) {
		this.dmin = dmin;
	}


	public Double getRms() {
		return rms;
	}


	public void setRms(Double rms) {
		this.rms = rms;
	}


	public Integer getGap() {
		return gap;
	}


	public void setGap(Integer gap) {
		this.gap = gap;
	}


	public String getMagType() {
		return magType;
	}


	public void setMagType(String magType) {
		this.magType = magType;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String gettitle() {
		return title;
	}


	public void settitle(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return "Property [mag=" + mag + ", place=" + place + ", time=" + time + ", update=" + update + ", tz=" + tz
				+ ", url=" + url + ", detail=" + detail + ", felt=" + felt + ", cdi=" + cdi + ", mm=" + mm + ", alert="
				+ alert + ", status=" + status + ", tsunami=" + tsunami + ", sig=" + sig + ", net=" + net + ", code="
				+ code + ", ids=" + ids + ", sources=" + sources + ", types=" + types + ", nst=" + nst + ", dmin="
				+ dmin + ", rms=" + rms + ", gap=" + gap + ", magType=" + magType + ", type=" + type + ", title="
				+ title + "]";
	}
	
	
	
}
