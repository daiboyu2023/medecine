package com.medecine.dby.pojo;

public class treenav {
	public treenav(int id, String text, String state, int aid, String url, int nid) {
		super();
		this.id = id;
		this.text = text;
		this.state = state;
		this.aid = aid;
		this.url = url;
		this.nid = nid;
	}
	@Override
	public String toString() {
		return "treenav [id=" + id + ", text=" + text + ", state=" + state + ", img=" + aid + ", url=" + url + ", nid="
				+ nid + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getImg() {
		return aid;
	}
	public void setImg(int img) {
		this.aid = img;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	
	public treenav() {
		super();
		// TODO Auto-generated constructor stub
	}

	int id;
	String text;
	String state;
	int aid;
	String url;
	int nid;
}
