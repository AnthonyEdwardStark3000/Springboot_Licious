package com.example.Licious.Controller;

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
import com.example.Licious.Repository.RegisterRepository;
import com.example.Licious.Repository.RegisterRepository1;


@Controller
public class Register_Controller {
	
	@Autowired
    RegisterRepository re;
	@Autowired
	RegisterRepository1 re1;
	 
	@RequestMapping(value = "/Signup")
	public String Register_page() {
	    
		return "signup";
	
	}
	
	@PostMapping(path="/Save",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)	
	public ResponseEntity<Register_Entity> funtion(@RequestBody Register_Entity rege )
	{
		T001_user_details ent1= new T001_user_details();
		ent1.setUsername(rege.getUsername());
		ent1.setPassword(rege.getPassword());
		re.save(ent1);
		
		int save_id=ent1.getUserid();
		System.out.println("save_id: "+save_id);
		
		T002_user_profile_details ent2 = new T002_user_profile_details();
		ent2.setFirstname(rege.getFirstname());
		ent2.setLastname(rege.getLastname());
		ent2.setEmail(rege.getEmail());
		ent2.setUserid(save_id);
		re1.save(ent2);
		
		rege.setResult("done");
		return new ResponseEntity<>(rege,HttpStatus.CREATED);
	}
	
}
