
package miinaharava;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Graafinenkayttoliittyma implements Runnable {

    private JFrame frame;
    private final Logiikka logiikka;
    private Karttanakyma kartta;
    
    public Graafinenkayttoliittyma(Logiikka logiikka){
        this.logiikka=logiikka;
    }
    
    @Override
    public void run() {
        frame = new JFrame("Miinaharava");
        frame.setPreferredSize(new Dimension(800,800));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(1,1));
        
        kartta = new Karttanakyma(logiikka, this);
        frame.getContentPane().add(kartta);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void aloitaPeli(){
        
    }
    
}
