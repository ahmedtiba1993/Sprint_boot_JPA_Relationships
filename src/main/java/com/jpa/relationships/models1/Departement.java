package com.jpa.relationships.models1;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Departement {
	
	  @Id
	  @GeneratedValue
	  private Integer id;

	  private String nom;
	  
	  @OneToMany(mappedBy = "departement")
	  private List<Employee> employees;

}
