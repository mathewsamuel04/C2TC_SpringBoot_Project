package com.tnsif.spring_data_jpa_mapping.dto;

import com.tnsif.jpa.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToStrin
public class OrderRequest {
	private Customer customer;
}
