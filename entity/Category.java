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
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ca_id;
	private String ca_name;
	private String ca_description;
}
