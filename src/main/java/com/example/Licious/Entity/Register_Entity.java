package com.example.Licious.Entity;

import java.sql.Date;

public class Register_Entity {

	public int userid; 
	public String username;
	public String password;
	public Date recorddate;
	public int userprofileid;
	public String firstname;
	public String lastname;
	public String email;
	public String result;
	public String productname;
	public float productprice;
	public Date productdate;
	
	
	public String[] order_details_load;
	
	public String[] getOrder_details_load() {
		return order_details_load;
	}
	public void setOrder_details_load(String[] order_details_load) {
		this.order_details_load = order_details_load;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public float getProductprice() {
		return productprice;
	}
	public void setProductprice(float productprice) {
		this.productprice = productprice;
	}
	public Date getProductdate() {
		return productdate;
	}
	public void setProductdate(Date productdate) {
		this.productdate = productdate;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRecorddate() {
		return recorddate;
	}
	public void setRecorddate(Date recorddate) {
		this.recorddate = recorddate;
	}
	public int getUserprofileid() {
		return userprofileid;
	}
	public void setUserprofileid(int userprofileid) {
		this.userprofileid = userprofileid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	

	
}
