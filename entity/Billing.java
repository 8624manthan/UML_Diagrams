package com.project.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Billing {

	@Id	
	private int bid;
	private int b_payment;
	private String b_type;
	private String b_date;
	private String b_desc;
	
}
