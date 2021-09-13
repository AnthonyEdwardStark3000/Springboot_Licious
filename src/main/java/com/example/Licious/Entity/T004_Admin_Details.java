package com.example.Licious.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class T004_Admin_Details {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int Adminid;
	public String Adminname;
	public String Username;
	public String password;
	public Date Recorddate;
	public int getAdminid() {
		return Adminid;
	}
	public void setAdminid(int adminid) {
		Adminid = adminid;
	}
	public String getAdminname() {
		return Adminname;
	}
	public void setAdminname(String adminname) {
		Adminname = adminname;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRecorddate() {
		return Recorddate;
	}
	public void setRecorddate(Date recorddate) {
		Recorddate = recorddate;
	}
	
	
	
}
