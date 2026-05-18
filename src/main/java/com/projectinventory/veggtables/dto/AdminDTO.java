package com.projectinventory.veggtables.dto;

public class AdminDTO {
	
	private Integer idadmin;
	private String user;
	private String password;
	private String email;
	private Boolean status;
	
	
	public Integer getIdadmin() {
		return idadmin;
	}
	public void setIdadmin(Integer idadmin) {
		this.idadmin = idadmin;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
