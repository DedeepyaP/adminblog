package com.blog.admin.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPosts {
	
	@JsonProperty("userId")
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
	@JsonProperty("id")
	private int id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("body")
	private String body;
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	@Override
	public String toString() {
		return "UsersPosts [userId=" + userId + ", name=" + name + ", username=" + username + ", email=" + email
				+ ", address=" + address + ", phone=" + phone + ", website=" + website + ", company=" + company
				+ ", id=" + id + ", title=" + title + ", body=" + body + "]";
	}	

}
