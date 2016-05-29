
package miinaharava.test;

import miinaharava.Logiikka;
import miinaharava.Pelilauta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class pelilautaTest {
    Pelilauta pelilauta = new Pelilauta();
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    public pelilautaTest() {
    }
    
    @Test
    public void onkoRuutuKaannettyPalauttaaTrueKunRuutuOnKaannetty(){
        pelilauta.kaannaRuutu(3, 5);
        Boolean vastaus = pelilauta.onkoRuutuKaannetty(3, 5);
        
        assertEquals(true, vastaus);
    }
    
    @Test
    public void onkoRuutuKaannettyPalauttaaFalseKunRuutuEiKaannetty(){
        Boolean vastaus = pelilauta.onkoRuutuKaannetty(4, 2);
        
        assertEquals(false, vastaus);
    }
    
    @Test
    public void ruutuLoytyyMiinaruuduistaKunOnMiinaruutu(){
        pelilauta.lisaaMiinaruutu(6, 8);
        Boolean vastaus = pelilauta.onkoMiinaruutu(6, 8);
        
        assertEquals(true, vastaus);
    }
    
    @Test
    public void ruutuEiLoydyMiinaruuduistaKunEiMiinaruutu(){
        Boolean vastaus = pelilauta.onkoMiinaruutu(6, 8);
        
        assertEquals(false, vastaus);
    }
}
