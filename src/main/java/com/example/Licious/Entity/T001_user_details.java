package com.example.Licious.Entity;



import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

import org.hibernate.annotations.CreationTimestamp;


@Entity
public class T001_user_details {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userid")
	public int userid; 
	
	
	public String username;
	public String password;
	
	
//	@Column(name="recorddate",nullable=false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Column(name="recordate")
	@CreationTimestamp
	public Timestamp recorddate;
	
	
	
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





//	public Set<T002_user_profile_details> getT002_user_profile_detailss() {
//		return T002_user_profile_detailss;
//	}
//
//
//
//	public void setT002_user_profile_detailss(Set<T002_user_profile_details> t002_user_profile_detailss) {
//		T002_user_profile_detailss = t002_user_profile_detailss;
//	}



	public Timestamp getRecorddate() {
		return recorddate;
	}



	public void setRecorddate(Timestamp recorddate) {
		this.recorddate = recorddate;
	}



	public Set<T002_user_profile_details> getT002_user_profile_detailss() {
		return T002_user_profile_detailss;
	}



	public void setT002_user_profile_detailss(Set<T002_user_profile_details> t002_user_profile_detailss) {
		T002_user_profile_detailss = t002_user_profile_detailss;
	}





	@OneToMany()
    @JoinColumn(name = "userid")
	private Set<T002_user_profile_details> T002_user_profile_detailss;

}
