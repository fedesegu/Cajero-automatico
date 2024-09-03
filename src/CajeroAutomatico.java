import java.util.concurrent.ThreadLocalRandom;
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

    }
    void salir() {
        System.out.println("Muchas gracias por utilizar nuestros servicios");
    }
}
