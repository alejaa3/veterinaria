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

	public StackImp<BlanketDTO> getPilaCobijas() {
		return stackSheets;
	}

	public void setPilaCobijas(StackImp<BlanketDTO> pilaCobijas) {
		this.stackSheets = pilaCobijas;
	}

	public void crearCobija(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			BlanketDTO sheet = new BlanketDTO();
			stackSheets.push(sheet);
		}

	}
	public boolean hayCobijas() {
		if (stackSheets.peek()!=null) {
			return true;
		}else {
			return false;
		}
		
	}

}
