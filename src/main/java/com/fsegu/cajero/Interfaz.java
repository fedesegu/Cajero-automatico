//Programa que emula la interfaz de un cajero automático.

package com.fsegu.cajero;

import java.util.Scanner;

public class Interfaz {
    public static void main(String[] arg){
       
       System.out.println("Por favor introduzca su número de identificación");
       Scanner scanner = new Scanner(System.in);
       String identificador = scanner.nextLine();
       System.out.println("Por favor introduzca su contraseña");
       String contraseña = scanner.nextLine();
       CajeroAutomatico cajero = new CajeroAutomatico(identificador, contraseña);
       
       
        int opcionSeleccionada;
        do {
            System.out.println("Elija una de las siguientes opciones:");
        System.out.println("  Escriba 1 para consultar su saldo");
        System.out.println("  Escriba 2 para ingresar dinero");
        System.out.println("  Escriba 3 para sacar dinero");
        System.out.println("  Escriba 4 para consultar dinero");
        System.out.println("  Para salir presiona cualquier otro número");


        //variable a la que le asignamos el valor del entero escaneado 
        opcionSeleccionada = scanner.nextInt();
        switch (opcionSeleccionada) {
        case 1:
        cajero.mostrarSaldo();
        break;
        case 2:
        cajero.ingresarDinero();
        break;
        case 3: 
        cajero.sacarDinero();
        case 4:
        cajero.consultarUltimosMovimientos();
        default:
        cajero.salir();
        }
        } while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada == 4);

}
       
}