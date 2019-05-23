package com.medecine.dby.pojo;

public class userPojo {
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
		return "userPojo [userId=" + userId + ", userPhone=" + userPhone + ", userName=" + userName + ", userPwd="
				+ userPwd + ", authorityId=" + authorityId + ", authorityName=" + authorityName + ", startTime="
				+ startTime + ", endTime=" + endTime + ", recordTime=" + recordTime + ", state=" + state + ", a=" + a
				+ ", rows=" + rows + "]";
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public userPojo(int userId, String userPhone, String userName, String userPwd, int authorityId,
			String authorityName, String startTime, String endTime, String recordTime, String state, int a, int rows) {
		super();
		this.userId = userId;
		this.userPhone = userPhone;
		this.userName = userName;
		this.userPwd = userPwd;
		this.authorityId = authorityId;
		this.authorityName = authorityName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.recordTime = recordTime;
		this.state = state;
		this.a = a;
		this.rows = rows;
	}
	public String getRecordTime() {
		return recordTime;
	}
	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}
	private int userId;
	private String userPhone;
	private String userName;
	private String userPwd;
	private int authorityId;
	private String authorityName;
	private String startTime;
	private String endTime;
	private String recordTime;
	private String state;
	private int a;
	private int rows;
	
	public userPojo(){}
}
