/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Test;

import org.junit.Test;
import static org.junit.Assert.*;
import datos.Creartarjeta;
import datos.Tipo;
import datos.Documento;
import java.util.Calendar;
import logica.Gestion;
/**
 *
 * @author pipet
 */
public class CrearTarjetaTest {
    
    public CrearTarjetaTest() {
    }
    
    @Test
    public void CrearTarjetaTitularNullTest(){
        Calendar c = Calendar.getInstance();
        Gestion gtar = new Gestion();
        Creartarjeta latar = gtar.Creartarjeta(null, null, null, 0, c.getTime(), Tipo.VISA, Documento.TI);
        assertNull(latar);
    }
    
    @Test
    public void CrearTarjetaNullTest(){
        Gestion gtar = new Gestion();
        Creartarjeta latar = gtar.Creartarjeta(null, null, null, 0, null, null, null);
        assertNull(latar);
    }
    
    @Test
    public void CrearTarjetaBlancoTest(){
        Calendar c = Calendar.getInstance();
        Gestion gtar = new Gestion();
        Creartarjeta latar = gtar.Creartarjeta("", "", "", 0, c.getTime(), Tipo.MASTERCARD, Documento.CC);
        assertNull(latar);
    }
    
    @Test
    public void CrearTarjetaOkTest(){
        Calendar c = Calendar.getInstance();
        Gestion gtar = new Gestion();
        Creartarjeta latar = gtar.Creartarjeta("XXXX", "7534569812", "3341 3248 4236 5143", 110000, c.getTime(), Tipo.VISA, Documento.CC);
        assertNotNull(latar);
    }
    
    
}
