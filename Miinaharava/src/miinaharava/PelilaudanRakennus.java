
package miinaharava;

import java.util.Random;

public class PelilaudanRakennus {
    
    private Pelilauta pelilauta = new Pelilauta();
    
    public void asetaMiinat(){ //Asettaa miinat peliruudulle
        
        int i =0;
        int rivi = 0;
        int sarake = 0;
        Random random = new Random(16);
        
        while (i<40) {            
            rivi = random.nextInt();
            sarake = random.nextInt();
            
            if (!pelilauta.onkoRuutuKaannetty(sarake, rivi)){
                pelilauta.lisaaMiinaruutu(sarake, rivi);
                i++;
            }
        }
    }
    
}
