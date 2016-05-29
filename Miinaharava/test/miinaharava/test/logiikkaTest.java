
package miinaharava.test;

import miinaharava.Logiikka;
import miinaharava.Pelilauta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;


public class logiikkaTest {
    Logiikka logiikka = new Logiikka();
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
    
    public logiikkaTest() {
    }
    
    @Test
    public void kaannaRuutuToimiiOikein(){
        logiikka.kaannaRuutuJosEiKaannetty(5, 5);
        Boolean vastaus = pelilauta.onkoRuutuKaannetty(5, 5);
        
        assertEquals(true, vastaus);
    }
    
}
