
package miinaharava;

import java.util.HashMap;

public class Pelilauta {
    
    boolean[][] ruudut = new boolean[16][16];
    boolean[][] miinaruudut = new boolean [16][16];
    HashMap<Integer, String> ruudutJaArvot = new HashMap<Integer, String>();
    
    public boolean onkoRuutuKaannetty(int sarake, int rivi){ //Katsoo onko ruutu jo käännetty
        return ruudut[sarake][rivi];
    }
    
    public void lisaaMiinaruutu(int sarake, int rivi){ //Lisää miinan miinaruutulistaan
        miinaruudut[sarake][rivi]=true;
    }
    
    public void kaannaRuutu(int sarake, int rivi){ //Kääntää ruudun
        ruudut[sarake][rivi]=true;
    }
    
    public boolean onkoMiinaruutu(int sarake, int rivi){ //Tarkistaa onko ruudussa miina
        return miinaruudut[sarake][rivi];
    }
}
