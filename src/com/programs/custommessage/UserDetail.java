package com.programs.custommessage;

public class UserDetail {
	
	private String fName;
	private String lName;
	private String phone;
	private String date;
	
	private static UserDetail instance;
	
	private UserDetail() {}
	
	public static UserDetail getInstance() {
		if(instance == null) {
			instance = new UserDetail();
		}
		return instance;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}	

}
