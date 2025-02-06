package prueba;

import java.time.LocalDate;

public class raqueta extends Objeto {
	
	private String color;

	public raqueta(String nombre, String forma, String material, LocalDate fechaFabricacion) {
		super(nombre, forma, material, fechaFabricacion);
	}

	public raqueta(String nombre, String forma, String material, LocalDate fechaFabricacion, String color) {
		super(nombre, forma, material, fechaFabricacion);
		this.color = color;
	}

	
	
}
