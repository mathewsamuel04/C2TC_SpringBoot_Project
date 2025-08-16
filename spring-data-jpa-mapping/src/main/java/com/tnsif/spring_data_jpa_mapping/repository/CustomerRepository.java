package com.tnsif.spring_data_jpa_mapping.repository;

import com.tnsif.jpa.dto.OrderResponse;
import com.tnsif.jpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public class CustomerRepository extends JpaRepository<Customer,Integer>{
	@Query("SELECT new com.javatechie.jpa.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}
