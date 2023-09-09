package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.SheetDTO;
import co.edu.unbosque.util.StackImp;

public class SheetDAO {
	private StackImp<SheetDTO> stackSheets;

	public SheetDAO() {
		stackSheets = new StackImp<SheetDTO>();
	}

	public SheetDAO(StackImp<SheetDTO> stackSheets) {
		super();
		this.stackSheets = stackSheets;
	}

	public StackImp<SheetDTO> getPilaCobijas() {
		return stackSheets;
	}

	public void setPilaCobijas(StackImp<SheetDTO> pilaCobijas) {
		this.stackSheets = pilaCobijas;
	}

	public void crearCobija(int cantidad1, int cantidad2) {
		for (int i = 0; i < cantidad1; i++) {
			SheetDTO sheet = new SheetDTO(i, "Lana");
			stackSheets.push(sheet);
		}
		for (int i = 0; i < cantidad2; i++) {
			SheetDTO sheet = new SheetDTO(i, "Algodon");
			stackSheets.push(sheet);
		}
	}
	
	public boolean darCobija() {
		
		return false;
		
	}
}
