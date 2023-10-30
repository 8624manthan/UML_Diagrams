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
public class OrderDetails {

	@Id
	private int od_int;
	private String od_name;
	private String od_desc;
	
}
