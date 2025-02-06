package prueba;

import java.time.LocalDate;

public class raquetaPadel extends raqueta {

	public raquetaPadel(String nombre, String forma, String material, LocalDate fechaFabricacion) {
		super(nombre, forma, material, fechaFabricacion);
	}

	public raquetaPadel(String nombre, String forma, String material, LocalDate fechaFabricacion, String color) {
		super(nombre, forma, material, fechaFabricacion, color);
	}

	
	
}
