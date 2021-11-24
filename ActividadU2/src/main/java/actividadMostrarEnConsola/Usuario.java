package actividadMostrarEnConsola;

import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre, apellido, edad, hobbie, editor de código preferido, sistema operativo que utiliza");
		
		String nombre = sc.nextLine();
		String apellido = sc.nextLine();
		String edad = sc.nextLine();
		String hobbie = sc.nextLine();
		String editorPreferido = sc.nextLine();
		String sistemaOperativo = sc.nextLine();
		
		System.out.println("\nLos datos ingresados fueron:\n Nombre:" +  nombre);
		System.out.println(" Apellido:" +  apellido);
		System.out.println(" Edad:" +  edad);
		System.out.println(" Hobbie:" +  hobbie);
		System.out.println(" Editor de código preferido:" +  editorPreferido);
		System.out.println(" Sistema operativo que utiliza:" +  sistemaOperativo);
	
	}

}
