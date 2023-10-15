package tarea5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PasswordApp {

	public static void main(String[] args) {
		/*Password password = new Password();
		String generatedPassword = password.getPassword();
		System.out.println("La contraseña es: " + generatedPassword);*/
		try {
			   Scanner scanner = new Scanner(System.in);

		        System.out.print("Ingrese la longitud de las contraseñas: ");
		        int longitud = scanner.nextInt();

		        System.out.print("Ingrese la cantidad de contraseñas: ");
		        int cantidad = scanner.nextInt();

		        Password[] password = new Password[cantidad];
		        boolean[] isItStrong = new boolean[cantidad];
		        
		        String isItStrongMessage = "Es debil!!";
		        for(int i = 0; i<cantidad; i++) {
		        	password[i] = new Password(longitud);
		        	isItStrong[i] = password[i].esFuerte(); 
		        	if(isItStrong[i] == true) {
		        		isItStrongMessage = "Es fuerte!!";
		        	}
		        	
		        	System.out.println("Contraseña " + (i + 1) + ": " + password[i].getPassword() + " " + "Tu contraseña " + isItStrongMessage);	        	
		        }
		 }
		 catch (InputMismatchException e) {
	            System.out.println("Por favor, escribir un numero valido");
	        }	
	    }
}
