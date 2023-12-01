package com.smhrd.model;

public class MemberVO {

	// 1. 필드(데이터, 속성) --> table의 column명과 일치시키자!!!
	private String email;
	private String pw;
	private String tel;
	private String address;
	
	
	// 2. 메소드(로직, 행동)
	
	public MemberVO() {}

	// getter&setter
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
}
