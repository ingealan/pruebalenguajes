package com.alanyrommel.prueba;

public class CuentaAhorros extends Cuenta{
    private boolean estado;
    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        CacularEstado();
    }
public void  CacularEstado(){
    if (saldo < 100) {
        this.estado = false;
    }
    else {
        this.estado = true;
    }
}
    @Override
    public void Depositar(float valor) {
        if (estado) {
            numdeConsig++;
            this.saldo += valor;
            System.out.println("El valor actual es: "+this.saldo);
        }
        else {
            System.out.println("Cuenta Inactiva");;
        }
    }
    @Override
    public void Retirar(float valor) {
        if (estado) {
            numdeRet++;
            Retiros(valor);
        }
        else {
            System.out.println("Cuenta Inactiva");;
        }
    }
    public void Retiros(float valor) {
        if (numdeRet >= 4) {
            comisionMen++;
            System.out.println("Un dolar fue agragado a su comision mensual, valor actuual: "+comisionMen);
            this.saldo -= (valor+comisionMen);
            System.out.println("El valor actual es: "+this.saldo);
            CacularEstado();
        }
        else {
            this.saldo -= valor;
            System.out.println("El valor actual es: "+this.saldo);
            CacularEstado();
        }
    }
    @Override
    public void Imprimir(){
        System.out.println("El saldo es: "+this.saldo);
        System.out.println("El estado es: "+this.estado);
        System.out.println("La comision mensual es: "+interesmensual);
        System.out.println("El total de transacciones es: "+(numdeRet+numdeConsig));
    }

}
