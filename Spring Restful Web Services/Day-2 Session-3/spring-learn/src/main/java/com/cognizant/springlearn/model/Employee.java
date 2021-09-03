package com.cognizant.springlearn.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

	private int id;

	private String name;

	private double salary;

	private String permanent;

	private Date dateOfBirth;

	private Department department;

	private Skill skill;

}