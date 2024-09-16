package com.fsegu.cajero;

import java.util.concurrent.ThreadLocalRandom;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import com.fsegu.banco.CuentaBancaria;
import com.fsegu.mock.GeneradorAutomaticoDeMovimientos;

public class CajeroAutomatico {
    private CuentaBancaria cuentaBancariaActual;

    protected CajeroAutomatico (String identificador, String contraseña){
        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0, 50000);
    cuentaBancariaActual = new CuentaBancaria("Nombre cualquiera", cantidadAleatoria);
    }
    protected void mostrarSaldo() {
        System.out.println("Su saldo es + " + cuentaBancariaActual.obtenerSaldo());
    }
    protected void ingresarDinero(){
        System.out.println("Cuanto dinero quieres ingresar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.ingresarDinero(cantidad);
    }
    protected void sacarDinero(){
        System.out.println("Cuanto dinero quieres sacar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.ingresarDinero(cantidad);
    }
    protected void consultarUltimosMovimientos(){
        GeneradorAutomaticoDeMovimientos generadorAutomaticoDeMovimientos = new GeneradorAutomaticoDeMovimientos();
        System.out.println("Cuantos movimientos quieres consultar?");
        Scanner scanner = new Scanner(System.in);
        int numeroDeMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAutomaticoDeMovimientos.obtenerMovimiento(numeroDeMovimientos, "EUR");
        mostrarMovimientos(movimientos);
    }
    private void mostrarMovimientos (ArrayList<String> movimientos){
        for (String movimiento: movimientos){
            System.out.println(movimiento);
        }
    }
    protected void salir() {
        System.out.println("Muchas gracias por utilizar nuestros servicios");
    }
}
