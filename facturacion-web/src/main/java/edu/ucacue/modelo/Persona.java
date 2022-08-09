package edu.ucacue.modelo;

import lombok.*;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Persona implements Serializable {

	private static final long serialVersionUID = 1607830177598686701L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String nombre;
	private String apellido;
	private String telefono;
	private Integer numeroHijos;
	
	@Column(unique = true)
	private String cedula;
	


	
}
