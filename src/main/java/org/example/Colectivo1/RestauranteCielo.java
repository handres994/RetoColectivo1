package org.example.Colectivo1;
import java.util.*;
public class RestauranteCielo {
    public static void main(String[] args) {
        //ENTRADAS
        Scanner keyEntry = new Scanner(System.in);
        Integer menuOption=null;
        String colorAzul = "\u001B[96m";
        String colorReset = "\u001B[0m";
        char rpta;

        ArrayList <Object> platos = new ArrayList<>();
        ArrayList<HashMap<String, Object>> empleados = new ArrayList<>();
        ArrayList<String> ingredientes = new ArrayList<>();



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

            HashMap<String,Object> diccionarioEmpleados = new HashMap<>();

            HashMap<String, Object> diccionarioPlatos = new HashMap<>();


                if(menuOption==1){
                    System.out.println("modificando opcion 1 del menu");

                    System.out.println("INGRESA EL ID: ");
                    diccionarioEmpleados.put("ID: ", keyEntry.nextInt());
                    keyEntry.nextLine();
                    System.out.println("INGRESA EL NOMBRE: ");
                    diccionarioEmpleados.put("NOMBRE: ", keyEntry.nextLine());

                    System.out.println("FECHA DE NACIMIENTO: ");
                    diccionarioEmpleados.put("FECHA DE NACIMIENTO: ", keyEntry.nextInt());
                    platos.add(diccionarioEmpleados);
                } else if (menuOption==2) {


                    System.out.println("modificando opcion 2 del menu");
                    System.out.println("INGRESA EL ID: ");
                    diccionarioPlatos.put("ID: ", keyEntry.nextInt());
                    keyEntry.nextLine();
                    System.out.println("INGRESA EL NOMBRE DEL PLATO: ");
                    diccionarioPlatos.put("NOMBRE: ", keyEntry.nextLine());

                    System.out.println("DESEA AGREGAR INGREDIENTES: SI/NO ");
                    rpta = keyEntry.next() .toUpperCase() .charAt(0);
                     while (rpta){

                     }
                     diccionarioPlatos.put("INGREDIENTES: ", keyEntry.nextLine());

                    System.out.println("PRECIO: ");
                    diccionarioPlatos.put("PRECIO: ", keyEntry.nextInt());
                    empleados.add(diccionarioPlatos);
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
