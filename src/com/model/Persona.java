package com.model;

import java.time.LocalDate;

public class Persona {

	private String nombre;
	private String apellido;
	private String dni;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, String apellido, String dni, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
