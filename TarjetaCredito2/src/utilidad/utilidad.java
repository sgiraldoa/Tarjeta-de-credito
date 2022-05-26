/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidad;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PC
 */
public class utilidad {
     public static String convertirDateString(Date fecha){
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        if (fecha == null){
            return sd.format(new Date());
        }else{
            return sd.format(fecha);
        }
        
    }
}

