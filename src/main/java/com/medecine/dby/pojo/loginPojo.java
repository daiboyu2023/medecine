package com.medecine.dby.pojo;

public class loginPojo {
	@Override
	public String toString() {
		return "loginPojo [loginId=" + loginId + ", userId=" + userId + ", userName=" + userName + ", loginTime="
				+ loginTime + "]";
	}
	public loginPojo(int loginId, int userId, String userName, String loginTime) {
		super();
		this.loginId = loginId;
		this.userId = userId;
		this.userName = userName;
		this.loginTime = loginTime;
	}
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	public loginPojo() {}
	private int loginId;
	private int userId;
	private String userName;
	private String loginTime;
}
