package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.AnimalDTO;
import co.edu.unbosque.util.DequeList;

public class AnimalDAO {
	private DequeList<AnimalDTO> colaAnimales;
	
	public AnimalDAO() {
		colaAnimales = new DequeList<AnimalDTO>();
	}

	public AnimalDAO(DequeList<AnimalDTO> animales) {
		super();
		this.colaAnimales = animales;
	}

	public DequeList<AnimalDTO> getAnimales() {
		return colaAnimales;
	}

	public void setAnimales(DequeList<AnimalDTO> animales) {
		this.colaAnimales = animales;
	}
	
	public void agregarAnimal(int id, String nombre, String raza) {
		colaAnimales.insertFirst(new AnimalDTO(id, nombre, raza));
	}
	
	public String atenderAnimal(boolean seraAtendido) {
		String respuesta = "";
		if (seraAtendido = true) {
			respuesta = "Se atendio al animal: \n " + colaAnimales.getHead().getInfo() + ".";
			colaAnimales.removeFirst();		
		} else {
			respuesta = "No se puede atender al animal. Vuelva otro dia";		
		}
		return respuesta;	
	}
	
}
