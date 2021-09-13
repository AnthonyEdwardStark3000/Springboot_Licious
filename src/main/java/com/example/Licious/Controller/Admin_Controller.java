package com.example.Licious.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Licious.Entity.Register_Entity;
import com.example.Licious.Repository.AdminRepository;

@Controller
public class Admin_Controller {
	
	@Autowired
	AdminRepository adminrep;
	
	
	@RequestMapping("/admin")
	public String admindetails()
	{
		return "admin";
	}
	
	@PostMapping("/admin_check")
	public ResponseEntity<Register_Entity> funtion(@RequestBody Register_Entity arep )
	{
		System.out.println("Admin Entry chcekc");
		String username= arep.getUsername();
		String password= arep.getPassword();
		String login_id=adminrep.admin_check(username,password);
		System.out.println("33");
		String[] login_array = login_id.split(",");
		System.out.println("Login check");
		arep.setUserid(Integer.parseInt(login_array[0]));
		arep.setFirstname(login_array[1]);
		System.out.println("controller check");
		return new ResponseEntity<>(arep,HttpStatus.CREATED);	
	}

}
