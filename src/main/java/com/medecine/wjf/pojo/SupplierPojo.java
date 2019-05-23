package com.medecine.wjf.pojo;

public class SupplierPojo {

	private Integer supplierId;
	
	private String supplierName;
	
	private String contactsName;
	
	private String contactsPhone;
	
	private String supplierAddress;
	
	private Integer userId;
	
	private String userName;

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getContactsName() {
		return contactsName;
	}

	public void setContactsName(String contactsName) {
		this.contactsName = contactsName;
	}

	public String getContactsPhone() {
		return contactsPhone;
	}

	public void setContactsPhone(String contactsPhone) {
		this.contactsPhone = contactsPhone;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "SupplierPojo [supplierId=" + supplierId + ", supplierName=" + supplierName + ", contactsName="
				+ contactsName + ", contactsPhone=" + contactsPhone + ", supplierAddress=" + supplierAddress
				+ ", userId=" + userId + ", userName=" + userName + "]";
	}
}
