package co.edu.unbosque.model;

public class BlanketDTO {
	private int ID;
	private String material;

	public BlanketDTO() {
		// TODO Auto-generated constructor stub
	}

	public BlanketDTO(int iD, String material) {
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
		return "BlanketDTO [ID=" + ID + ", material=" + material + "]";
	}

}
