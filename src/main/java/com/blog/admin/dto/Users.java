package com.blog.admin.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Users {
	
	@JsonProperty("id")
	private int userId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("username")
	private String username;
	@JsonProperty("email")
	private String email;
	@JsonProperty("address")
	private Address address;
	@JsonProperty("phone")
	private String phone;
	@JsonProperty("website")
	private String website;
	@JsonProperty("company")
	private Company company;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", name=" + name + ", username=" + username + ", email=" + email
				+ ", address=" + address.toString() + ", phone=" + phone + ", website=" + website 
				+ ", company=" + company.toString() + "]";
	}	

}
