package org.example.Colectivo1;
import java.util.*;
public class RestauranteCielo {
    public static void main(String[] args) {
        //ENTRADAS
        Scanner keyEntry = new Scanner(System.in);
        Integer menuOption=null;
        String colorAzul = "\u001B[96m";
        String colorReset = "\u001B[0m";



        boolean entradaValida = false;

        //PROCESO
        System.out.println(colorAzul + "\n*********************************");
        System.out.println("***** Restaurante El Cielo *****");
        System.out.println("*********************************");
        
        System.out.println("\n☁️👕 Bienvenido al Gestor del CIELO ☁️\n");
        System.out.println("✨ ¿Qué deseas realizar?");
        System.out.println("1️⃣  Registrar empleado 🧑‍🍳📝");
        System.out.println("2️⃣  Registrar plato 🍲➕");
        System.out.println("3️⃣  Ver empleados 👨‍👩‍👧‍👦📋");
        System.out.println("4️⃣  Ver platos 🍽️📖");
        System.out.println("5️⃣  Presiona 5 para SALIR ❌🚪)" + colorReset);

        while (!entradaValida) {

            try {
                System.out.println("\nDigita una opcion: ");
                menuOption = keyEntry.nextInt();

                if (menuOption >= 1 && menuOption <= 5) {
                    entradaValida = true;
                } else {
                    System.out.println("¡Error! La opción debe estar entre 1 y 5.\n");
                }
            }catch (InputMismatchException e){
                System.out.println("¡Error! Debes ingresar un número entero.\n");
                keyEntry.nextLine();
            }

        }

        while(true){



                if(menuOption==1){

                } else if (menuOption==2) {

                } else if (menuOption==3) {

                } else if (menuOption==4) {

                } else if (menuOption==5) {

                    break;
                }
            while (!entradaValida) {

                try {
                System.out.println("\nAhora digita otra opcion: ");
                menuOption = keyEntry.nextInt();

                    if (menuOption >= 1 && menuOption <= 5) {
                        entradaValida = true;
                    } else {
                        System.out.println("¡Error! La opción debe estar entre 1 y 5.\n");
                    }
                }catch (InputMismatchException e){
                    System.out.println("¡Error! Debes ingresar un número entero.\n");
                    keyEntry.nextLine();
                }

            }



        }
    }
}
