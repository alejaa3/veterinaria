package co.edu.unbosque.controller;

import co.edu.unbosque.model.persistence.AnimalDAO;
import co.edu.unbosque.model.persistence.BlanketDAO;
import co.edu.unbosque.view.Console;

public class Controller {
	private Console con;
	private AnimalDAO adao;
	private BlanketDAO bdao;
	private int id=0;

	public Controller() {
		con = new Console();
		adao = new AnimalDAO();
		bdao=new BlanketDAO();

		run();
	}

	private void run() {
		con.printLine("¡Bienvenido a la veterinaria!");
		con.printLine("ingrese el numero de cobijas disponibles el dia de hoy:");
		int cobijas = con.readInt();
		bdao.crearCobija(cobijas);
		while(true) {
			if(bdao.hayCobijas()==true) {
			con.printLine("inserte nombre de la mascota:");
			String nombre = con.readCadena();
			con.printLine("inserte raza de la mascota:");
			String raza = con.readCadena();
			adao.agregarAnimal(id, nombre, raza);

			con.printLine(adao.atenderAnimal(true));

			//break;
			}else {
				con.printLine(adao.atenderAnimal(false));

			}
		//}
		}

	}
}
