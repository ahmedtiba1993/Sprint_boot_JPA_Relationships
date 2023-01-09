package com.jpa.relationships.models1;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Mission {
	
	 @Id
	 @GeneratedValue
	 private Integer id;

	 private String nom;

	 private int durees;
	 
	 @ManyToMany(mappedBy = "missions")
	 private List<Employee> employee;

}
