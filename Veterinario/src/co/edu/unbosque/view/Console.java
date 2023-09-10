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

	public float readFloat() {
		return sc.nextFloat();
	}

	public long readLong() {
		return sc.nextLong();
	}

	public String readCadena() {
		return sc.nextLine();
	}

	public String readLinea() {
		return sc.next();
	}

	public void print(String salida) {
		System.out.println(salida);
	}

	public void printLine(String salida) {
		System.out.print(salida);
	}

	public void burnLine() {
		sc.nextLine();
	}
}
