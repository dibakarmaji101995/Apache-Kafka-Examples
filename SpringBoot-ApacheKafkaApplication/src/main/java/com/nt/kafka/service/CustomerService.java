package com.nt.kafka.service;

import java.util.List;

import com.nt.kafka.binding.Customer;

public interface CustomerService {
    public String sendObjects(List<Customer> listCust);
}
