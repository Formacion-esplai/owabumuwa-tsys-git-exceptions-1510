package tarea3;

import java.util.Random;
//import java.util.Scanner;

public class Tarea3 {
	public static int generarNumeroAleatorio() {
		
        Random randon = new Random();
        return randon.nextInt(1000);
    }
	
	public static void getIfEven(int num) throws Tarea3Exception {
        if (num % 2 == 0) {
            throw new Tarea3Exception("El número es par");
        } else {
            throw new Tarea3Exception("El número es impar");
        }
       
    }
	
	public static void main(String[] args) {
        try {
            int randomNum = generarNumeroAleatorio();
            System.out.println("El número aleatorio generado es: " + randomNum);
            getIfEven(randomNum);
        } catch (Tarea3Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
