package com.example.Licious.Controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Licious.Entity.Register_Entity;
import com.example.Licious.Entity.T001_user_details;
import com.example.Licious.Entity.T002_user_profile_details;
import com.example.Licious.Entity.T003_Product_Details;
import com.example.Licious.Entity.T004_Admin_Details;
import com.example.Licious.Repository.AdminPageRepository;

@Controller
public class Admin_Page_Controller {

	@Autowired
	AdminPageRepository adminprep;
	
	
	@RequestMapping("/adminpage")
	public String admin()
	{
		return "AdminPage";
	}
	
	@PostMapping(path="/productsave",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)	
	public ResponseEntity<Register_Entity> funtion(@RequestBody Register_Entity rege )
	{
		T003_Product_Details ent1= new T003_Product_Details();
	    
	         ent1.setProductname(rege.getProductname());
			 ent1.setProductprice(rege.getProductprice());
			 ent1.setProductdate(rege.getProductdate());
			 ent1.setQuantity(rege.getProductquantity());
			 adminprep.save(ent1);
			 
		rege.setResult("done");
		return new ResponseEntity<>(rege,HttpStatus.CREATED);
		
	}
	
	
}
