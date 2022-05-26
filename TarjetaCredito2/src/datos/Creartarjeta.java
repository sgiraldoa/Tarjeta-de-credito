package datos;


import java.io.Serializable;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago
 */
public class Creartarjeta implements Serializable {
    private Tarjeta laTarjeta;
    private Date Creacion;
    private Tipo tipo;
    private Documento opcion1;
    private String numTarjeta;
    private Operaciones op;
    
    public Creartarjeta(Tarjeta laTarjeta, Date Creacion, Tipo tipo, String numTarjeta, Documento opcion1){
        this.laTarjeta = laTarjeta;
        this.Creacion = Creacion;
        this.tipo = tipo;
        this.opcion1 = opcion1;
        this.numTarjeta = numTarjeta;
    }

    
    public Tarjeta getTarjeta(){
        return this.laTarjeta;
    }

    public Date getFechaCrea(){
        return this.Creacion;
    }
    
        public String getNumTarjeta(){
        return this.numTarjeta;
    }
        
    public Tipo getOpcion(){
        return this.tipo;
    }
    
    public Documento Documento(){
        return this.opcion1;
    }
    
   
    
    @Override
    public String toString() {
        return "Titular: "+laTarjeta.getTitular()+"\n Fecha de creacion: "+this.Creacion+ "\n Numero de Tarjeta: "+this.numTarjeta+"\n Tipo de tarjeta: "+this.tipo;
    }
 
    
    
}

    