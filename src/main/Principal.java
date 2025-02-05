package main;

import java.time.LocalDate;

import com.model.Estudiante;
import com.model.Persona;

public class Principal {

	public static void main(String[] args) {
		
		Persona pepe = new Persona("Pepe", "Espino", "29517183H", LocalDate.of(2005, 9, 15)); 
		Estudiante manuel = new Estudiante("Manuel", "Muñoz", "23423426R", LocalDate.of(2005, 9, 8));
		
		System.out.println();
	}
	
}
