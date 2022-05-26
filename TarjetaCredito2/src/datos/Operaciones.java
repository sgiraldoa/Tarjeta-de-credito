/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.io.Serializable;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author PC
 */
  public class Operaciones implements Serializable{
    private int costoCompra;
    private int valorPago;
    private int cupo;
    
    public int getCosCompra(){
        return this.costoCompra;
    }
    
    public void setCosCompra(int costoCompra){
        
        this.costoCompra=costoCompra;
    }
    
    public int getCupodis(){
        return this.cupo;
    }
    
    public void setCupodis(int cupo){
        this.cupo=cupo;
    }
    
    public int getValPago(){
        return this.valorPago;
    }
    
    public void setValPago(int valorPago){
        this.valorPago=valorPago;
    }

    public String compra(int costoCompra, int cupoVal){
       if(cupoVal < costoCompra){
           return null;
       }else{
           cupoVal = cupoVal - costoCompra;
           this.cupo = cupoVal;
           String cosComp = Integer.toString(cupoVal); 
           return cosComp; 
       }  
    }
    
    public String pago(int valorPago, int cupoVal){
        cupoVal = cupoVal+valorPago;
        this.cupo = cupoVal;
        String pagoVal = Integer.toString(cupoVal);
        return pagoVal;
    }
    
     public String NumerosTar(){
        String numTarjeta, num1, num2, num3, num4;
        Random r = new Random();
        num1=Integer.toString(r.nextInt(9999-1000+1)+1000);
        num2=Integer.toString(r.nextInt(9999-1000+1)+1000);
        num3=Integer.toString(r.nextInt(9999-1000+1)+1000);
        num4=Integer.toString(r.nextInt(9999-1000+1)+1000);
        numTarjeta = (num1+" "+num2+" "+num3+" "+num4);
        return numTarjeta;
    }
     
    public int CalculoCupo(int salario){
        int valCup = salario*3;
        this.cupo = this.cupo+valCup;
        return valCup;
    }
    public Creartarjeta nuevatarjeta(Tarjeta laTarjeta, Date Creacion, Tipo tipo, String numTarjeta, Documento opcion1){
        Creartarjeta a = new Creartarjeta(laTarjeta, Creacion, tipo, numTarjeta, opcion1);
        a.Documento();
        a.getFechaCrea();
        a.getNumTarjeta();
        a.getOpcion();
        a.getTarjeta();
        return a;
}
  }
