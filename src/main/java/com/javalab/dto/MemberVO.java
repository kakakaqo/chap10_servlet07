package com.javalab.dto;

import java.util.Date;

public class MemberVO {
	
	// 필드
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date joindate;
	
	// 기본 생성자
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MemberVO(String id, String pwd, String name, String email){
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		
	}

	// 오버로딩 생성자
	public MemberVO(String id, String pwd, String name, String email, Date joindate) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.joindate = joindate;
	}

	// getter/setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	
}
