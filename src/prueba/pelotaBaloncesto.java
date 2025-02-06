package prueba;

import java.time.LocalDate;

public class pelotaBaloncesto extends Objeto {
	
	private int tamano;
	private String marca;

	public pelotaBaloncesto(String nombre, String forma, String material, LocalDate fechaFabricacion) {
		super(nombre, forma, material, fechaFabricacion);
		
	}

	public pelotaBaloncesto(String nombre, String forma, String material, LocalDate fechaFabricacion, int tamano, String marca) {
		
		this(nombre,forma,material,fechaFabricacion);
		this.marca = marca;
		this.tamano = tamano;
		
	}
	
}
