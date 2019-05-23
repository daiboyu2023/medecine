package com.medecine.wjf.pojo;

public class TreesPojo {

	private Integer id;
	
	private String text;
	
	private String state;
	
	private String url;
	
	private Integer nid;
	
	private Integer aid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getNid() {
		return nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	@Override
	public String toString() {
		return "TreesPojo [id=" + id + ", text=" + text + ", state=" + state + ", url=" + url + ", nid=" + nid
				+ ", aid=" + aid + "]";
	}
}
