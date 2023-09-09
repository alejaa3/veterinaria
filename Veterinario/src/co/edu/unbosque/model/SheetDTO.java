package co.edu.unbosque.model;

public class SheetDTO {
	private int ID;
	private String material;
	
	public SheetDTO() {
		// TODO Auto-generated constructor stub
	}

	public SheetDTO(int iD, String material) {
		super();
		ID = iD;
		this.material = material;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "SheetDTO [ID=" + ID + ", material=" + material + "]";
	}
	
	
}
