package co.edu.unbosque.controller;

import co.edu.unbosque.model.persistence.AnimalDAO;
import co.edu.unbosque.model.persistence.BlanketDAO;
import co.edu.unbosque.view.Console;

public class Controller {
	private Console con;
	private AnimalDAO adao;
	private BlanketDAO bdao;
	private int id = 0;

	public Controller() {
		con = new Console();
		adao = new AnimalDAO();
		bdao = new BlanketDAO();

		run();
	}

	private void run() {
		con.imprimirConSalto("¡Bienvenido a la veterinaria!");
		con.imprimirConSalto("Ingrese el numero de cobijas disponibles el dia de hoy:");
		int cobijas = con.readInt();
		bdao.crearCobija(cobijas);
		con.imprimirConSalto(bdao.mostrarTodo());
		while (true) {
			con.imprimirConSalto("¿Que desea hacer?");
			con.imprimirConSalto("1.) Agregar mascotas \n2.) Mostrar mascotas sin atender. \n3.) Atender mascota. \n4.) Mostrar animales atendidos. \n5.)Salir.");
			int cn = con.readInt();
			switch (cn) {
			case 1: {
				con.imprimirConSalto("Inserte nombre de la mascota:");
				String nombre = con.leerCadena();
				con.imprimirConSalto("Inserte raza de la mascota:");
				String raza = con.leerCadena();
				adao.agregarAnimal(id, nombre, raza);
				break;
			}
			case 2: {
				con.imprimirConSalto("Mostrando las mascotas a atender:");
				con.imprimirConSalto(adao.mostrarTodo());
				break;
			}
			case 3: {
				con.imprimirConSalto("Atendiendo mascota...");
				con.imprimirConSalto(adao.atenderAnimal(bdao.darCobija()));
				con.imprimirConSalto("Hay cobijas restantes?: " + bdao.hayCobijas());
				
				break;
			}
			
			case 4: {
				con.imprimirConSalto("Mostrando las mascotas atendidas:");
				con.imprimirConSalto(adao.mostrarAnimalesAtendidos());
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + cn);
			}

			// }
		}

	}
}
