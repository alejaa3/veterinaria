package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.AnimalDTO;
import co.edu.unbosque.util.DequeList;

public class AnimalDAO {
	private DequeList<AnimalDTO> colaAnimales;
	private DequeList<AnimalDTO> animalesAtendidos;

	public AnimalDAO() {
		colaAnimales = new DequeList<AnimalDTO>();
		animalesAtendidos = new DequeList<AnimalDTO>();
	}

	public AnimalDAO(DequeList<AnimalDTO> colaAnimales, DequeList<AnimalDTO> animalesAtendidos) {
		super();
		this.colaAnimales = colaAnimales;
		this.animalesAtendidos = animalesAtendidos;
	}

	public DequeList<AnimalDTO> getColaAnimales() {
		return colaAnimales;
	}

	public void setColaAnimales(DequeList<AnimalDTO> colaAnimales) {
		this.colaAnimales = colaAnimales;
	}

	public DequeList<AnimalDTO> getAnimalesAtendidos() {
		return animalesAtendidos;
	}

	public void setAnimalesAtendidos(DequeList<AnimalDTO> animalesAtendidos) {
		this.animalesAtendidos = animalesAtendidos;
	}

	public void agregarAnimal(int id, String nombre, String raza) {
		colaAnimales.insertLast(new AnimalDTO(id, nombre, raza));
	}

	public String atenderAnimal(boolean seraAtendido) {
		String respuesta = "";
		if (seraAtendido == true) {
			respuesta = "Se atendio al animal: \n " + colaAnimales.getHead().getInfo() + ".";
			animalesAtendidos.insertLast(colaAnimales.getHead().getInfo());
			colaAnimales.removeFirst();
		
		} else {
			respuesta = "No se puede atender al animal. Vuelva otro dia";
		}
		return respuesta;
	}

	public String mostrarTodo() {
		String animales = "";
		for (int i = 0; i < colaAnimales.size(); i++) {
			animales = colaAnimales.toString();
		}
		return animales;
	}
	
	public String mostrarAnimalesAtendidos() {
		String animales = "";
		for (int i = 0; i < animalesAtendidos.size(); i++) {
			animales = animalesAtendidos.toString();
		}
		return animales;
	}

}
