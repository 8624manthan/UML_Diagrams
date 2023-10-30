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
public class Cart {

	@Id
	private int cr_id;
	private String cr_name;
	private String cr_date;
	private String cr_desc;
	private String cr_payment;
}
