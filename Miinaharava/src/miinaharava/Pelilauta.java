
package miinaharava;

public class Pelilauta {
    
    boolean[][] ruudut = new boolean[16][16];
    boolean[][] miinaruudut = new boolean [16][16];
    
    public boolean onkoRuutuVarattu(int sarake, int rivi){
        return miinaruudut[sarake][rivi];
    }
    
    public void lisaaMiinaruutu(int sarake, int rivi){
        miinaruudut[sarake][rivi]=true;
    }
}
