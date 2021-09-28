package com.example.Licious.Entity;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class T003_Product_Details {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    public int Productid;
	public String Productname;
	public float Productprice;
	public Date Productdate;
	public Date Recorddate;
	public int quantity;

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductid() {
		return Productid;
	}
	public void setProductid(int productid) {
		Productid = productid;
	}
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String productname) {
		Productname = productname;
	}
	public float getProductprice() {
		return Productprice;
	}
	public void setProductprice(float productprice) {
		Productprice = productprice;
	}
	public Date getProductdate() {
		return Productdate;
	}
	public void setProductdate(Date productdate) {
		Productdate = productdate;
	}
	public Date getRecorddate() {
		return Recorddate;
	}
	public void setRecorddate(Date recorddate) {
		Recorddate = recorddate;
	}
	
}
