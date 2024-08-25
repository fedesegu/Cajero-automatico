//Programa que emula la interfaz de un cajero automático.

import java.util.Scanner;

public class Interfaz {
    public static void main(String[] arg){
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("  Escriba 1 para consultar su saldo");
        System.out.println("  Escriba 2 para ingresar dinero");
        System.out.println("  Escriba 3 para sacar dinero");
        System.out.println("  Escriba 4 para consultar dinero");

        Scanner scanner = new Scanner(System.in);
        //variable a la que le asignamos el valor del entero escaneado 
        int opcionSeleccionada = scanner.nextInt();
        System.out.println("La opción que usted a elegido es:" + opcionSeleccionada);
    }

}