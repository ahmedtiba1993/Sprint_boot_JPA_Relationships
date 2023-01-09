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
public class Cours {

	 @Id
	 @GeneratedValue
	 private Long id;

	 @OneToMany(mappedBy = "cours")
	 Set<InscriptionCours> inscriptions;
}
