package com.jpa.relationships.models1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Adresse {
	
	  @Id
	  @GeneratedValue
	  private Integer id;

	  private String rue;

	  private String Num_maison;

	  private String code_postale;
	  
	  @OneToOne
	  @JoinColumn(name="employee_id")
	  private Employee employee;

}
