package com.example.Licious.Entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;


//import org.hibernate.mapping.Set;

@Entity
public class T002_user_profile_details {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int userprofileid;
    @Column(name="userid")
    public int userid;
	public String firstname;
	public String lastname;
	public String email;
//	@Column(name="recorddate",nullable=false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Column(name="recordate")
	@CreationTimestamp
	public Timestamp recorddate;
	
	
	
	public int getUserprofileid() {
		return userprofileid;
	}



	public void setUserprofileid(int userprofileid) {
		this.userprofileid = userprofileid;
	}



	public int getUserid() {
		return userid;
	}



	public void setUserid(int userid) {
		this.userid = userid;
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



	



	public Timestamp getRecorddate() {
		return recorddate;
	}



	public void setRecorddate(Timestamp recorddate) {
		this.recorddate = recorddate;
	}



	public T001_user_details getT001_user_detailss() {
		return T001_user_detailss;
	}



	public void setT001_user_detailss(T001_user_details t001_user_detailss) {
		T001_user_detailss = t001_user_detailss;
	}



    @ManyToOne()
    @JoinColumn(name="userid",referencedColumnName="userid",insertable=false,updatable=false)
    private T001_user_details T001_user_detailss;
	
	
}
