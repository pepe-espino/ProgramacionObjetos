package com.model;

import java.time.LocalDate;

public class Profesor extends Persona {
	
	private int salario;
	private String especialidad;

	public Profesor(String nombre, String apellido, String dni, LocalDate fechaNacimiento) {
		super(nombre, apellido, dni, fechaNacimiento);
		
	}

	public Profesor(String nombre, String apellido, String dni, LocalDate fechaNacimiento,
		 int salario,String especialidad) {
			
			this(nombre, apellido, dni, fechaNacimiento);
			this.salario = salario;
			this.especialidad = especialidad;
		}
	
}
