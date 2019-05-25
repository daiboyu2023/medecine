package com.medecine.dby.pojo;

public class drugPojo {
	public drugPojo(int drugId, String drugName, String drugUnit, int drugNum, int tishiNum) {
		super();
		this.drugId = drugId;
		this.drugName = drugName;
		this.drugUnit = drugUnit;
		this.drugNum = drugNum;
		this.tishiNum = tishiNum;
	}
	@Override
	public String toString() {
		return "drugPojo [drugId=" + drugId + ", drugName=" + drugName + ", drugUnit=" + drugUnit + ", drugNum="
				+ drugNum + ", tishiNum=" + tishiNum + "]";
	}
	public int getDrugId() {
		return drugId;
	}
	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getDrugUnit() {
		return drugUnit;
	}
	public void setDrugUnit(String drugUnit) {
		this.drugUnit = drugUnit;
	}
	public int getDrugNum() {
		return drugNum;
	}
	public void setDrugNum(int drugNum) {
		this.drugNum = drugNum;
	}
	public int getTishiNum() {
		return tishiNum;
	}
	public void setTishiNum(int tishiNum) {
		this.tishiNum = tishiNum;
	}
	public drugPojo() {}
	private int drugId;
	private String drugName;
	private String drugUnit;
	private int drugNum;
	private int tishiNum;
}
