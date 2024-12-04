package com.aplicativo.cadastrousuario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_professor")
@Getter
@Setter
public class Professor {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank 
	@Size(min = 5, max = 100)
    private String nome;
	
	@NotBlank
	@Size(min = 5, max = 100)
    private String materia;
	
	@NotBlank
	@Size(min = 5, max = 100)
    private String unidade;

}