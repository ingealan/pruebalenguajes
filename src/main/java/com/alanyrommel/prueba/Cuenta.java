package com.alanyrommel.prueba;

public class Cuenta {
    protected float saldo;
    protected int numdeConsig = 0;
    protected int numdeRet = 0;
    protected float tasaAnual;
    protected float comisionMen = 0;
    protected float porcentajemensual;
    protected float interesmensual;
    public Cuenta(float saldo,float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
        InteresMen();
    }
    public void Depositar(float valor) {
        this.numdeConsig++;
        this.saldo += valor;
    }
    public void Retirar(float valor) {
        this.numdeRet++;
        if (this.saldo < valor) {
            System.out.println("El saldo no puede ser negativo");
        }
        else{
            this.saldo -= valor;
        }
    }
   public void InteresMen() {
         porcentajemensual= (this.tasaAnual /12)/100;
         interesmensual= saldo * porcentajemensual;
        this.saldo = interesmensual+this.saldo;
       System.out.println("El interes mensual es de "+interesmensual+" y el saldo actual es de "+this.saldo);
   }
   public void Comision(float comision) {
        this.comisionMen += comision;
        this.saldo -= this.comisionMen-this.saldo;
        InteresMen();
   }
   public void Imprimir(){
        System.out.println("El saldo es: "+this.saldo);
       System.out.println("La comision es de "+this.comisionMen);
        System.out.println("El interes mensual es: "+this.interesmensual);
        System.out.println("La cantidad de consig es: "+this.numdeConsig);
        System.out.println("La cantidad de ret es: "+this.numdeRet);

    }
}

