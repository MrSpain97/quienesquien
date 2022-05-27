package com.example.quienesquien;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("1. Jugar");
            System.out.println("2. Mostrar top puntuaciones");
            System.out.println("3. Salir");

            try {

                System.out.println("Introduce un numero: ");
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion){
                    case 1 -> System.out.println("opcion 1\n");
                    case 2 -> System.out.println("opcion 2\n");
                    case 3 -> salir = true;
                    default -> System.out.println("Selecciona una opcion correcta las opciones son entre 1 y 3");
                }
            }catch (Exception e){
                System.out.println("\nDebes introducir un numero\n");
            }
        }
    }
}
