package org.example.Colectivo1;
import java.util.*;
public class RestauranteCielo {
    public static void main(String[] args) {
        //COLORES
        String colorBlue = "\u001B[96m";
        String colorRed = "\u001B[31m";
        String colorOrange = "\u001B[38;5;208m";
        String colorYellow = "\u001B[38;5;226m";
        String colorGreen = "\u001B[92m";
        String colorPurple = "\u001B[35m";
        String colorReset = "\u001B[0m";
        //ENTRADAS
        Scanner keyEntry = new Scanner(System.in); // Scanner
        Integer menuOption=null; // Variable de las opciones del menu
        Character reply; //Variable para ciclo do while en ingredientes
        ArrayList<HashMap<String, Object>> employees = new ArrayList<>(); //Variable para array de empleados
        ArrayList<HashMap<String, Object>> dishes = new ArrayList<>(); //Variable para array de platos
        boolean validEntry = false; //Variable para ciclo de validacion de datos string e int

        //PROCESO
        System.out.println(colorBlue + "\n*********************************");
        System.out.println("***** Restaurante El Cielo *****");
        System.out.println("*********************************");
        
        System.out.println("\n☁️👕 Bienvenido al Gestor del CIELO ☁️\n");
        System.out.println("✨ ¿Qué deseas realizar?");
        System.out.println("1️⃣  Registrar empleado 🧑‍🍳📝");
        System.out.println("2️⃣  Registrar plato 🍲➕");
        System.out.println("3️⃣  Ver empleados 👨‍👩‍👧‍👦📋");
        System.out.println("4️⃣  Ver platos 🍽️📖");
        System.out.println("5️⃣  Presiona 5 para SALIR ❌🚪)" + colorReset);

        while (!validEntry) { //Validacion de string y enteros en menuOption

            try {
                System.out.println(colorYellow + "\nDigita una opcion del menu: " + colorReset);
                menuOption = keyEntry.nextInt();

                if (menuOption >= 1 && menuOption <= 5) {
                    validEntry = true;
                } else {
                    System.out.println(colorRed + "¡Error! La opción debe estar entre 1 y 5." + colorReset);
                }
            }catch (InputMismatchException e){
                System.out.println(colorRed + "¡Error! Debes ingresar un número entero." + colorReset);
                keyEntry.nextLine();
            }

        }

        while(true){
            validEntry=false; //Formatea la variable para try cash en validacion para string y entero
            HashMap<String, Object> dictionaryDish = new LinkedHashMap<>(); //Se utiliza LinkedHashMap para mantener el orden en que se insertaron los elementos.
            HashMap<String,Object> dictionaryEmployee = new LinkedHashMap<>(); //Se utiliza LinkedHashMap para mantener el orden en que se insertaron los elementos.
            ArrayList<String> ingredients = new ArrayList<>(); //Variable para array de ingredientes

                if(menuOption==1) { // Opcion registrar a un empleado

                    System.out.println(colorOrange + "Ingrese el ID de empleado: ");
                    dictionaryEmployee.put(colorBlue + "id" + colorRed,colorPurple + keyEntry.nextInt() + colorRed); // Hace Scanner a ("clave", valor) para el objeto dictionaryEmployee
                    keyEntry.nextLine(); // Limpia buffer
                    System.out.println("Ingrese el nombre del empleado: ");
                    dictionaryEmployee.put(colorBlue + "nombre" + colorRed, colorPurple + keyEntry.nextLine() + colorRed);
                    System.out.println("Fecha de nacimiento: ");
                    dictionaryEmployee.put(colorBlue + "fechaNacimiento" + colorRed, colorPurple + keyEntry.next() + colorRed);
                    keyEntry.nextLine(); // Limpia buffer
                    System.out.println("Cargo del empleado: ");
                    dictionaryEmployee.put(colorBlue + "cargo" + colorRed, colorPurple + keyEntry.nextLine() + colorRed);
                    System.out.println("Salario del empleado: " + colorReset);
                    dictionaryEmployee.put(colorBlue + "salario" + colorRed , colorPurple + keyEntry.nextLine() + colorReset);

                    System.out.println(colorGreen + "\nEmpleado registrado exitosamente! ✅💯" + colorReset);
                    employees.add(dictionaryEmployee); // Añade objeto: dictionaryEmployee a la lista(Array) Empleados(employees)

                } else if (menuOption==2) { // Opcion registrar un plato
                    System.out.println(colorOrange + "Ingrese el ID del plato: ");
                    dictionaryDish.put(colorBlue + "id" + colorRed, colorPurple + keyEntry.nextInt() + colorRed); // Hace Scanner a ("clave", valor) para el objeto dictionaryDish
                    keyEntry.nextLine(); // Limpia Buffer
                    System.out.println("Ingrese el nombre del plato: ");
                    dictionaryDish.put(colorBlue + "nombre" + colorRed, colorPurple + keyEntry.nextLine() + colorRed);
                    do{
                        System.out.println("Nombre de ingrediente: ");
                        ingredients.add(keyEntry.nextLine());
                        System.out.println("Desea ingresar otro ingrediente? SI/NO ");
                        reply = keyEntry.next().toUpperCase().charAt(0);
                        keyEntry.nextLine();
                        dictionaryDish.put(colorBlue + "ingredientes" + colorRed, colorPurple + ingredients + colorRed);
                    }while (reply== 'S');
                    System.out.println("Precio: ");
                    dictionaryDish.put(colorBlue + "precio" + colorRed, colorPurple + keyEntry.nextInt() + colorReset);
                    System.out.println(colorGreen + "Plato registrado exitosamente! ✅💯" + colorReset);
                    dishes.add(dictionaryDish); // Añade objeto: dictionaryDish a la lista(Array) Platos(dishes)
                } else if (menuOption==3) { // Opcion mostrar empleados
                    System.out.println(employees);
                } else if (menuOption==4) { // Opcion mostrar platos
                    System.out.println(dishes);
                } else if (menuOption==5) { // Opcion para SALIR del programa
                    System.out.println(colorGreen + "Gracias por visitarnos, vuelva pronto 🫶🏼" + colorReset);
                    break;
                }
            while (!validEntry) { //Validacion de string y enteros en menuOption

                try {
                    System.out.println(colorYellow + "\nDigita una opcion del menu: " + colorReset);
                menuOption = keyEntry.nextInt();

                    if (menuOption >= 1 && menuOption <= 5) {
                        validEntry = true;
                    } else {
                        System.out.println(colorRed + "¡Error! La opción debe estar entre 1 y 5.\n" + colorReset);
                    }
                }catch (InputMismatchException e){
                    System.out.println(colorRed + "¡Error! Debes ingresar un número entre 1 y 5.\n" + colorReset);
                    keyEntry.nextLine();
                }

            }
        }
    }
}
