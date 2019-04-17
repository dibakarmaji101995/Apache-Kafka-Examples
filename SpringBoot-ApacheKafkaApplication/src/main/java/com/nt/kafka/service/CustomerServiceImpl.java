package com.nt.kafka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.kafka.binding.Customer;
import com.nt.kafka.producer.Producer;

@Service(value="custService")
public class CustomerServiceImpl implements CustomerService{
     @Autowired
	private Producer producer;

	@Override
	public String sendObjects(List<Customer> listCust) {
		if(!listCust.isEmpty()) {
			for(Customer cust:listCust) {
				producer.send(cust);
			}
		}
		return "Customer Objects successfully sended...!!";
	}
     
}
