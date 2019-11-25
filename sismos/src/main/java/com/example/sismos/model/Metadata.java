package com.example.sismos.model;

public class Metadata {
	private Long generated;
	private String url;
	private String title;
	private String status;
	private String api;
	private Integer count;
	
	/**Constructor with parameters
	 * 
	 * @param generated
	 * @param url
	 * @param tittle
	 * @param status
	 * @param api
	 * @param count
	 */
	public Metadata(Long generated, String url, String title, String status, String api, Integer count) {
		this.generated = generated;
		this.url = url;
		this.title = title;
		this.status = status;
		this.api = api;
		this.count = count;
	}
	
	public Metadata() {
		
	}
	
	public Long getGenerated() {
		return generated;
	}
	public void setGenerated(Long generated) {
		this.generated = generated;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getApi() {
		return api;
	}
	public void setApi(String api) {
		this.api = api;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Metadata [generated=" + generated + ", url=" + url + ", title=" + title + ", status=" + status
				+ ", api=" + api + ", count=" + count + "]";
	}

	

}
