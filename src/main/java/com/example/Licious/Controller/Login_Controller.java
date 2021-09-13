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
import com.example.Licious.Repository.LoginRepository;

@Controller
public class Login_Controller {
	@Autowired
	LoginRepository logrep;
	@RequestMapping("/Login")
	public String returnData()
	{
		return "login";
	}
	
	@PostMapping(path="/login_check",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Register_Entity> funtion(@RequestBody Register_Entity rege )
	{
		System.out.println("Entry chcekc");
		String username= rege.getUsername();
		String password= rege.getPassword();
		String login_id=logrep.login_check(username,password);
		String[] login_array = login_id.split(",");
		rege.setUserid(Integer.parseInt(login_array[0]));
		rege.setFirstname(login_array[1]);
		rege.setLastname(login_array[2]);
		System.out.println("controller check");
		return new ResponseEntity<>(rege,HttpStatus.CREATED);	
	}

}
