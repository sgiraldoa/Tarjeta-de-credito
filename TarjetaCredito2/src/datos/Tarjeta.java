package datos;


import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Tarjeta implements Serializable {
    private String titular;
    private String documento;
    private int saldo;
    
    public String getTitular(){
        return this.titular;
    }
    
     public String getIdenti(){
        return this.documento;
    }
    
    public int getSaldo(){
        return this.saldo;
    }
    
    public void setTitu(String titular){
        if(titular != null){
            this.titular=titular;
        }
       
    }
    
    public void setIdenti(String identi){
        if(identi != null){
            this.documento=documento;
        }
    }
    
    
    public void setSaldo(int saldo){
        if(documento != null){
           this.saldo=saldo;
        }
    }
    
    
    @Override
    public String toString(){
        return "Titular: "+this.titular+" Identificacion: "+this.documento+ " Saldo ingresado: "+this.saldo;
        
    }
    
}

    