package com.alanyrommel.prueba;

public class CuentaCorriente extends Cuenta{
    private float total;
    private float sobregir=0;

    public CuentaCorriente(float saldo, float tasaAnual) {

        super(saldo, tasaAnual);
        InteresMen();
    }

    @Override
    public void Retirar(float valor) {
       total=this.saldo-valor;
       if (total>0){
           numdeRet++;
           this.saldo=total;
           System.out.println("Retiro hecho con exito"+this.saldo);
       }
       else{
           numdeRet++;
           sobregir=total;
           this.saldo=sobregir;
           System.out.println("Su saldo se encuentra sobregirado "+this.total);
       }
    }
    @Override
    public void Depositar(float valor) {
        if (sobregir<0){
            numdeConsig++;
            sobregir=sobregir+valor;
            this.saldo=sobregir;
            if (sobregir<0){
                System.out.println("Aun posee un saldo pendiente de:"+sobregir);
            }
            else{
                System.out.println("Ya no posee sobregiro, su saldo es de:"+sobregir);
            }
        }
        else{
            numdeConsig++;

            this.saldo=this.saldo+valor;
            System.out.println("Su saldo actual es de:"+this.saldo);
        }
    }

    @Override
    public void Imprimir(){
        System.out.println("El saldo es: "+this.saldo);
        System.out.println("El sobregiro es: "+this.sobregir);
        System.out.println("La comision mensual es: "+interesmensual);
        System.out.println("El total de transacciones es: "+(numdeRet+numdeConsig));
    }
}
