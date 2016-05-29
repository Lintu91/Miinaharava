
package miinaharava;

public class Logiikka {
    Pelilauta pelilauta = new Pelilauta();
    
    public void kaannaRuutuJosEiKaannetty(int sarake, int rivi){ //Ei vielä toimi oikein jostain syystä
        if (pelilauta.onkoRuutuKaannetty(sarake, rivi)==false){
            pelilauta.kaannaRuutu(sarake, rivi);          
        }
    }
    
    public void maaritaRuudunArvo(int sarake, int rivi){ //Vielä kehitystasolla
        int miinanaapurit = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (pelilauta.onkoMiinaruutu(sarake, rivi)){
                    miinanaapurit++;
                }
                
            }
            
        }
    }
    
    
    
}
