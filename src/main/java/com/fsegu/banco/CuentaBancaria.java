package com.fsegu.banco;

public class CuentaBancaria {
    private String titular;
    private TipoDeCuenta tipoDeCuenta;
    private double saldo;

    private final double comision = 1.2;

    public CuentaBancaria (String titular, TipoDeCuenta tipo, double saldo) {
        this.titular = titular;
        this.tipoDeCuenta = tipo;
        this.saldo = saldo;
    }

    public CuentaBancaria (String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacarDinero (double cantidad) {
        saldo  -= cantidad;
    }
    private double calcularComision(){
        switch(tipoDeCuenta){
            case AHORRO:
                return comision;
            case NOMINA:
                return 0;
            default:
                return 0;
        }
    }
    public void ingresarDinero (double cantidad) {
        saldo += cantidad;
    }
    public void cambiarTipoDeCuenta (TipoDeCuenta nuevoTipo) {
        tipoDeCuenta = nuevoTipo;
    }
    public double obtenerSaldo() {
       return saldo;
    }
}
