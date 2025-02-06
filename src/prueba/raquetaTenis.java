package prueba;

import java.time.LocalDate;

public class raquetaTenis extends raqueta {

	public raquetaTenis(String nombre, String forma, String material, LocalDate fechaFabricacion) {
		super(nombre, forma, material, fechaFabricacion);
	}

	public raquetaTenis(String nombre, String forma, String material, LocalDate fechaFabricacion, String color) {
		super(nombre, forma, material, fechaFabricacion, color);
	}

}
