package prueba;

import java.time.LocalDate;

public class Objeto {

	private String nombre;
	private String forma;
	private String material;
	private LocalDate fechaFabricacion;
	
	
	public Objeto(String nombre, String forma, String material, LocalDate fechaFabricacion) {
		super();
		this.nombre = nombre;
		this.forma = forma;
		this.material = material;
		this.fechaFabricacion = fechaFabricacion;
	}
	
}
