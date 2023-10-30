package com.project.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int o_id;
	private String o_name;
	private int o_total;
	private String o_date;
	private long o_number;
}
