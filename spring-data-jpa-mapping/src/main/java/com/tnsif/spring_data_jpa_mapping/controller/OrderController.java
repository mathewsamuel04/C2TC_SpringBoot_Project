package com.tnsif.spring_data_jpa_mapping.controller;

import com.tnsif.jpa.dto.OrderRequest;
import com.tnsif.jpa.dto.OrderResponse;
import com.tnsif.jpa.entity.Customer;
import com.tnsif.jpa.repository.CustomerRepository;
import com.tnsif.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
	 @Autowired
	    private CustomerRepository customerRepository;
	    @Autowired
	    private ProductRepository productRepository;

	    @PostMapping("/placeOrder")
	    public Customer placeOrder(@RequestBody OrderRequest request){
	       return customerRepository.save(request.getCustomer());
	    }

	    @GetMapping("/findAllOrders")
	    public List<Customer> findAllOrders(){
	        return customerRepository.findAll();
	    }

	    @GetMapping("/getInfo")
	    public List<OrderResponse> getJoinInformation(){
	        return customerRepository.getJoinInformation();
	    }
}
