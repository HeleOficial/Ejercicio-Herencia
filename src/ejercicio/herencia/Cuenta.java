/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.herencia;

/**
 *
 * @author estudiante308
 */
public class Cuenta {
    
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    
    public void consignar(float cantidad) {
        this.saldo += cantidad;
        this.numeroConsignaciones++;
    }
    
    public void retirar(float cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
            this.numeroRetiros++;
        } else {
            System.out.println("La cantidad a retirar excede el saldo actual"
                    + ".");
        }
    }
    
    public void imprimir() {
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Número de consignaciones: " + this.numeroConsignaciones);
        System.out.println("Número de retiros: " + this.numeroRetiros);
        System.out.println("Tasa anual: " + this.tasaAnual + "%");
        System.out.println("Comisión mensual: " + this.comisionMensual);
    }
}
    
    
    

