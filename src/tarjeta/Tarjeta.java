package tarjeta;


import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Tarjeta {
    public Date fecha;
    
    private int valorCompra;
    private int valorPago;
    private int cupoTarjeta;
    
    public int obtValorCompra(){
        return this.valorCompra;
    }
    
    public void modificarValorCompra(int valorCompra){
        this.valorCompra=valorCompra;
    }
    
    public int obtCupo(){
        return this.cupoTarjeta;
    }
    
    public void modificarCupo(int cupo){
        this.cupoTarjeta=cupo;
    }
    
    public int obtValorPago(){
        return this.valorPago;
    }
    
    public void modificarValorPago(int valorPago){
        this.valorPago=valorPago;
    }
}
    