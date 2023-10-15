package tarea4;

import java.util.Scanner;

public class Tarea4 {
	  public static double realizarCalculo(String operacion) {
	        Scanner scanner = new Scanner(System.in);

	        switch (operacion) {
	            case "suma":
	                System.out.println("Escribir el primer numero ");
	                double num1 = Double.parseDouble(scanner.nextLine());
	                System.out.println("Escribir el segundo numero ");
	                double num2 = Double.parseDouble(scanner.nextLine());
	                return num1 + num2;
	            case "resta":
	                System.out.println("Escribir el primer numero ");
	                num1 = Double.parseDouble(scanner.nextLine());
	                System.out.println("Escribir el segundo numero ");
	                num2 = Double.parseDouble(scanner.nextLine());
	                return num1 - num2;
	            case "multiplicacion":
	                System.out.print("Escribir el primer numero");
	                num1 = Double.parseDouble(scanner.nextLine());
	                System.out.print("Escribir el segundo numero");
	                num2 = Double.parseDouble(scanner.nextLine());
	                return num1 * num2;
	            case "division":
	                System.out.print("Escribir el numerador: ");
	                num1 = Double.parseDouble(scanner.nextLine());
	                System.out.print("Escribir el denominador: ");
	                num2 = Double.parseDouble(scanner.nextLine());
	                if (num2 == 0) {
	                    throw new ArithmeticException("Division por cero.");
	                }
	                return num1 / num2;
	            case "potencia":
	                System.out.print("Escribir la base");
	                num1 = Double.parseDouble(scanner.nextLine());
	                System.out.print("Escribir el exponente");
	                num2 = Double.parseDouble(scanner.nextLine());
	                return Math.pow(num1, num2);
	            case "raiz cuadrada":
	                System.out.print("Escribir el numero");
	                num1 = Double.parseDouble(scanner.nextLine());
	                if (num1 < 0) {
	                    throw new ArithmeticException("No se puede calcular la raíz cuadrada de un numero negativo");
	                }
	                return Math.sqrt(num1);
	            case "raiz cubica":
	                System.out.print("Escribir el numero: ");
	                num1 = Double.parseDouble(scanner.nextLine());
	                return Math.cbrt(num1);
	            default:
	                throw new IllegalArgumentException("Operacion invalida!!!");
	        }
	    }
	  
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la operación que quieres hacer: suma, resta, multiplicacion, division, potencia, raiz cuadrada y raiz cubica ? ");
	        String operacion = scanner.nextLine().toLowerCase();

	        try {
	            double resultado = realizarCalculo(operacion);
	            System.out.println("El resultado es " + resultado);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Escribir un numero valido.");
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: Operacion no valida.");
	        }
	    }


}
