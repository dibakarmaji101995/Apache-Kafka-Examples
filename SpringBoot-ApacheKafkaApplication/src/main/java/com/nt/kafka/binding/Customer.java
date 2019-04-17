package com.nt.kafka.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName(value="cust")
public class Customer {
    private int id;
    private String name;
    private String addrs;
    
	public Customer(int id, String name, String addrs) {
		super();
		this.id = id;
		this.name = name;
		this.addrs = addrs;
	}
    
    public Customer() {
		System.out.println("Customer::0-param constructor");
	}
}
