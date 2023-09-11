package co.edu.unbosque.model;
import java.io.Serializable;

public class AnimalDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5198527779387933322L;

	private int id;
	private String nombre;
	private String raza;
	private String tieneCobija;

	public AnimalDTO() {
		// TODO Auto-generated constructor stub
	}
	public AnimalDTO(int id, String nombre, String raza) {
		super();
		this.setId(id);
		this.nombre = nombre;
		this.raza = raza;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getTieneCobija() {
		return tieneCobija;
	}
	public void setTieneCobija(String tieneCobija) {
		this.tieneCobija = tieneCobija;
	}
	@Override
	public String toString() {
		return "AnimalDTO [nombre=" + nombre + ", raza=" + raza + "]";
	}

}
