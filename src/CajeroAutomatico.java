import java.util.concurrent.ThreadLocalRandom;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CajeroAutomatico {
    CuentaBancaria cuentaBancariaActual;
    CajeroAutomatico (String identificador, String contraseña){
        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0, 50000);
    cuentaBancariaActual = new CuentaBancaria("Nombre cualquiera", cantidadAleatoria);
    }
    void mostrarSaldo() {
        System.out.println("Su saldo es + " + cuentaBancariaActual.obtenerSaldo());
    }
    void ingresarDinero(){
        System.out.println("Cuanto dinero quieres ingresar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.ingresarDinero(cantidad);
    }
    void sacarDinero(){
        System.out.println("Cuanto dinero quieres sacar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.ingresarDinero(cantidad);
    }
    void consultarUltimosMovimientos(){
        GeneradorAutomaticoDeMovimientos generadorAutomaticoDeMovimientos = new GeneradorAutomaticoDeMovimientos();
        System.out.println("Cuantos movimientos quieres consultar?");
        Scanner scanner = new Scanner(System.in);
        int numeroDeMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAutomaticoDeMovimientos.obtenerMovimiento(numeroDeMovimientos, "EUR");
        mostrarMovimientos(movimientos);
    }
    void mostrarMovimientos (ArrayList<String> movimientos){
        for (String movimiento: movimientos){
            System.out.println(movimiento);
        }
    }
    void salir() {
        System.out.println("Muchas gracias por utilizar nuestros servicios");
    }
}
