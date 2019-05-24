package com.medecine.wjf.pojo;

public class DruginfoPojo {

	private Integer drugId;
	
	private String drugName;
	
	private String drugSpecifications;
	
	private String supplierName;
	
	private String drugUnit;
	
	private Integer drugNum;
	
	private Integer supplierId;
	
	private Double priceIn;
	
	private Double priceOut;
	
	private Integer tishiNum;

	public Integer getDrugId() {
		return drugId;
	}

	public void setDrugId(Integer drugId) {
		this.drugId = drugId;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getDrugSpecifications() {
		return drugSpecifications;
	}

	public void setDrugSpecifications(String drugSpecifications) {
		this.drugSpecifications = drugSpecifications;
	}

	public String getDrugUnit() {
		return drugUnit;
	}

	public void setDrugUnit(String drugUnit) {
		this.drugUnit = drugUnit;
	}

	public Integer getDrugNum() {
		return drugNum;
	}

	public void setDrugNum(Integer drugNum) {
		this.drugNum = drugNum;
	}

	public Integer getSuppliersId() {
		return supplierId;
	}

	public void setSuppliersId(Integer suppliersId) {
		this.supplierId = suppliersId;
	}

	public Double getPriceIn() {
		return priceIn;
	}

	public void setPriceIn(Double priceIn) {
		this.priceIn = priceIn;
	}

	public Double getPriceOut() {
		return priceOut;
	}

	public void setPriceOut(Double priceOut) {
		this.priceOut = priceOut;
	}

	public Integer getTishiNum() {
		return tishiNum;
	}

	public void setTishiNum(Integer tishiNum) {
		this.tishiNum = tishiNum;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	@Override
	public String toString() {
		return "DruginfoPojo [drugId=" + drugId + ", drugName=" + drugName + ", drugSpecifications="
				+ drugSpecifications + ", drugUnit=" + drugUnit + ", drugNum=" + drugNum + ", suppliersId="
				+ supplierId + ", priceIn=" + priceIn + ", priceOut=" + priceOut + ", tishiNum=" + tishiNum + "]";
	}
	
}
