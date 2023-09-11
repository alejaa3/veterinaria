package co.edu.unbosque.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import co.edu.unbosque.util.exceptions.InvalidNumberException;

public class Console {
	private Scanner sc;

	public Console() {
		sc = new Scanner(System.in);
	}

	public int readInt() {
		while (true) {
			try {
				return sc.nextInt();
			} catch (InputMismatchException e) {
				try {
					throw new InvalidNumberException();
				} catch (InvalidNumberException ex) {
					System.out.println(ex.getMessage());
					continue;

				}
			}
		}
	}

	public String leerLineaEntera() {
		return sc.nextLine();
	}

	public String leerCadena() {
		return sc.next();
	}

	public void qemarLinea() {
		sc.nextLine();
	}

	public void imprimirConSalto(Object object) {
		System.out.println(object);
	}

	public void imprimirSinSalto(Object imprimirPorTipo) {
		// TODO Auto-generated method stub

	}

}
