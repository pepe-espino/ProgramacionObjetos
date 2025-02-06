package com.model;

import java.time.LocalDate;

public class Estudiante extends Persona {

	private String codigoMatricula;
	private String estudios;
	private int cursoActual;
	
	public Estudiante(String nombre, String apellido, String dni, LocalDate fechaNacimiento) {
		super(nombre, apellido, dni, fechaNacimiento);
	}
	
	public Estudiante(String nombre, String apellido, String dni, LocalDate fechaNacimiento,
		String codigoMatricula,String estudios,int cursoActual) {
		
		this(nombre, apellido, dni, fechaNacimiento);
		this.codigoMatricula = codigoMatricula;
		this.estudios = estudios;
		this.cursoActual = cursoActual;
	}
	
	public String toString() {
		return super.toString()+" "+ this.cursoActual;
	}
	
}

