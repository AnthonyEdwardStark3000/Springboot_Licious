package com.example.Licious.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Licious.Entity.Register_Entity;
import com.example.Licious.Repository.DeliveryPageRepository;

@Controller
public class DeliveryPageController {
	
	@Autowired
    DeliveryPageRepository cr;	
	
  @GetMapping("/order_details_load")	
  public ResponseEntity<Register_Entity> order_details_load()throws IOException 
  {
	  Register_Entity re = new Register_Entity();
	  String order_details_load1[]=cr.order_details_load1();
	  re.setOrder_details_load(order_details_load1);
	  return new ResponseEntity<>(re,HttpStatus.CREATED);	
  }
  @RequestMapping("/deliver")
  public String deliver()
  {
	  return "Deliverypage";
  }
  
}
