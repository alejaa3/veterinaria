package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.BlanketDTO;
import co.edu.unbosque.util.StackImp;

public class BlanketDAO {
	private StackImp<BlanketDTO> stackSheets;

	public BlanketDAO() {
		stackSheets = new StackImp<BlanketDTO>();
	}

	public BlanketDAO(StackImp<BlanketDTO> stackSheets) {
		super();
		this.stackSheets = stackSheets;
	}

	public StackImp<BlanketDTO> getStackSheets() {
		return stackSheets;
	}

	public void setStackSheets(StackImp<BlanketDTO> stackSheets) {
		this.stackSheets = stackSheets;
	}

	public void crearCobija(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			BlanketDTO sheet = new BlanketDTO(i, "Lana");
			stackSheets.push(sheet);
		}

	}

	public boolean darCobija() {
		boolean booleano;
		if (stackSheets.isEmpty()) {
			booleano = false;
		} else {
			stackSheets.pop();
			booleano = true;
		}
		return booleano;
	}

	public String mostrarTodo() {
		String cobijas = "";
		for (int i = 0; i < stackSheets.size(); i++) {
			cobijas = stackSheets.toString();
		}
		return cobijas;
	}

	public String hayCobijas() {
		String resp = "";
		if (stackSheets.peek() != null) {
			resp = "Si hay.";
		} else {
			resp = "No hay.";
		}
		return resp;
	}
}
