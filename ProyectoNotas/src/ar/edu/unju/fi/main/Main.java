package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;

public class Main {

	public static void main(String[] args) {
		
		//NOS PIDEN REGISTRAR LAS NOTAS DE 4 MATERIAS DEL ALUMNO ALFREDO EZEQUIEL GONZALEZ
		
		Alumno alumno = new Alumno();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el legajo: ");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese el apellido: ");
		String apellido = scanner.next();
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		
		System.out.println(alumno.toString());
		
	}

}
