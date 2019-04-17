package com.nt.kafka.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.kafka.binding.Customer;
import com.nt.kafka.service.CustomerService;

@RestController
public class CustomerRestController {
	
	private List<Customer> listCust=new ArrayList<Customer>();
	
	@Autowired
	private CustomerService service;
	
     public CustomerRestController() {
		listCust.add(new Customer(1,"raja","hyd"));
		listCust.add(new Customer(2,"ramesh","beng"));
		listCust.add(new Customer(3,"rani","kol"));
	}
     
     @GetMapping(value="/getAll",produces= {"application/json"})
     public ResponseEntity<List<Customer>> getAllCust(){
    	 return ResponseEntity.ok(listCust);
     }
     
     @PostMapping(value="/addCusts",consumes= {"application/json","application/xml"})
     public ResponseEntity<String> addCust(@RequestBody List<Customer> listCust){
    	 String resultMsg=null;
    	 //invoke service class method
    	 resultMsg=service.sendObjects(listCust);
    	 return ResponseEntity.ok(resultMsg);
     }    
}
