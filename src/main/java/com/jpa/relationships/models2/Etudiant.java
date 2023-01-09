package com.jpa.relationships.models2;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Etudiant {
	
	@Id
	@GeneratedValue
	private Long id;
	 
	private String nom;
	
	@OneToMany(mappedBy = "etudiant")
	Set<InscriptionCours> inscriptions;

}
