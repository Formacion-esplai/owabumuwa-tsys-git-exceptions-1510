package tarea2;

public class Tarea2 {
    public static void main(String[] args) {
        try {
            throw new MyException("Esto es un objeto Exception");
        } catch (MyException e) {
            System.out.println("Exception capturada con este mensaje: " + e.getMessage());
        } finally {
            System.out.println("Programa terminado!!!");
        }
    }
}