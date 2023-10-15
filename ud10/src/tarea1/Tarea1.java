package tarea1;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Tarea1 {
    
    public void compareRandomNumbers() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(50) + 1;
        System.out.println("Random number: " + randomNumber);
        int numberOfTimes = 0;
        
        while (true) {
            try {
                System.out.println("Enter a number to guess the random number:");
                int enteredNumber = scanner.nextInt();
                numberOfTimes++;

                if (enteredNumber > randomNumber) {
                    System.out.println("Tu numero es mayor que el numero aleatorio!!!");
                } else if (enteredNumber < randomNumber) {
                    System.out.println("Tu numero es menor que el numero aleatorio!!!");
                } else {
                    System.out.println("Yesss!!! El numero aleatorio es " + enteredNumber);
                    System.out.println("Han entrado " + numberOfTimes + " veces");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Es invalido!!! Escribir un numero valido por favor!");
                scanner.next();
            }
        }
        
        scanner.close(); 
    }


	public static void main(String[] args) {
		Tarea1 compareNumbersClass = new Tarea1();
		
		compareNumbersClass.compareRandomNumbers();

	}

}
