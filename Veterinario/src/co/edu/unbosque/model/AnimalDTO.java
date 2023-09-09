package co.edu.unbosque.model;

public class AnimalDTO {
	private String nombre;
	private String raza;

	public AnimalDTO() {
		// TODO Auto-generated constructor stub
	}
	public AnimalDTO(String nombre, String raza) {
		super();
		this.nombre = nombre;
		this.raza = raza;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	@Override
	public String toString() {
		return "AnimalDTO [nombre=" + nombre + ", raza=" + raza + "]";
	}

}
