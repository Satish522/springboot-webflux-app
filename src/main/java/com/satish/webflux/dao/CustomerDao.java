package com.satish.webflux.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

import com.satish.webflux.dto.Customer;

@Component
public class CustomerDao {
	
	public List<Customer> getCustomers(){
		return IntStream.rangeClosed(1, 50)
					.mapToObj(i -> new Customer(i, "Customer"+i))
					.collect(Collectors.toList());
	}
}
