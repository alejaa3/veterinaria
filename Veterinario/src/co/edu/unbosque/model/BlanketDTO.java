package co.edu.unbosque.model;

public class BlanketDTO {
private boolean ingoodcondition;

public BlanketDTO() {
	ingoodcondition=false;
}

public boolean isIngoodcondition() {
	return ingoodcondition;
}

public void setIngoodcondition(boolean ingoodcondition) {
	this.ingoodcondition = ingoodcondition;
}

@Override
public String toString() {
	return "SheetDTO [ingoodcondition=" + ingoodcondition + "]";
}



	
	
}
