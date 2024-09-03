

public class CuentaBancaria {
    String titular;
    String tipoDeCuenta;
    Double numero;
    Double saldo;

    CuentaBancaria (String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    void sacarDinero (double cantidad) {
        saldo  -= cantidad;
    }
    void ingresarDinero (double cantidad) {
        saldo += cantidad;
    }
    void cambiarTipoDeCuenta (String nuevoTipo) {
        tipoDeCuenta = nuevoTipo;
    }
    double obtenerSaldo() {
       return saldo;
    }
}
