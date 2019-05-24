package com.medecine.wjf.pojo;

public class CustomerPojo {

	private Integer customerId;
	
	private String customerName;
	
	private String contactsName;
	
	private String contactsPhone;
	
	private String customerAddress;
	
	private String userId;
	
	private String username;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "CustomerPojo [customerId=" + customerId + ", customerName=" + customerName + ", contactsName="
				+ contactsName + ", contactsPhone=" + contactsPhone + ", customerAddress=" + customerAddress
				+ ", userId=" + userId + ", username=" + username + "]";
	}
	
}
