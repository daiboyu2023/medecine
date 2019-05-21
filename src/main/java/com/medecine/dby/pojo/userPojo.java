package com.medecine.dby.pojo;

public class userPojo {
	public userPojo(int userId, String userPhone, String userName, String userPwd, int authorityId, String authorityName) {
		super();
		this.userId = userId;
		this.userPhone = userPhone;
		this.userName = userName;
		this.userPwd = userPwd;
		this.authorityId = authorityId;
		this.authorityName = authorityName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public int getAuthorityId() {
		return authorityId;
	}
	public void setAuthorityId(int authorityId) {
		this.authorityId = authorityId;
	}
	public String getAuthorityName() {
		return authorityName;
	}
	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}
	@Override
	public String toString() {
		return "userInfo [userId=" + userId + ", userPhone=" + userPhone + ", userName=" + userName + ", userPwd="
				+ userPwd + ", authorityId=" + authorityId + ", authorityName=" + authorityName + "]";
	}
	private int userId;
	private String userPhone;
	private String userName;
	private String userPwd;
	private int authorityId;
	private String authorityName;
	
	public userPojo(){}
}
