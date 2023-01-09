package com.jpa.relationships.models1;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
@Slf4j
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(
			name="employee_identifier",
			nullable = false,
			unique = true
	)
	private String identifier;
	
	@Column(nullable = false)
	private String nom;
	
	@Column(nullable = false)
	private String prenom;
	
	@Column(nullable = false , unique = true)
	private String email;
	
	@Column(nullable = false)
	private String date_de_naissance;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private EmployeeRole role;
	
	@OneToOne
	@JoinColumn(name="adresse_id")
	private Adresse adresse;
	
	 @ManyToOne
	 @JoinColumn(name = "department_id")
	 private Departement departement;
	 
	 @ManyToMany
	 @JoinTable(
	      name = "employee_mission",
	      joinColumns = @JoinColumn(name = "employee_id"),
	      inverseJoinColumns = @JoinColumn(name = "mission_id")
	  )
	 private List<Mission> missions;
	
}
