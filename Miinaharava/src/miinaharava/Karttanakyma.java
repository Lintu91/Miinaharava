
package miinaharava;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Karttanakyma extends JPanel {
    
    private final JButton taulukko[][] = new JButton[16][16];
    Graafinenkayttoliittyma gLiittyma;
    Logiikka logiikka;
    JFrame frame;
    Graafinenkayttoliittyma kayttis;

    Karttanakyma(Logiikka logiikka, Graafinenkayttoliittyma gLiittyma) {
        this.logiikka=logiikka;
        this.gLiittyma=gLiittyma;
        
        this.setLayout(new GridLayout(16,16));
        JPanel paneeli = new JPanel();
        JPanel panel = new JPanel();
        
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                
                    JButton nappi = new JButton("");
                    paneeli.add(nappi);
                    taulukko[j][i] = nappi;
                
            }
        }
        this.logiikka = logiikka;
        
        this.setLayout(new BorderLayout());
        JButton nappula = new JButton("Exit");      
        JButton helppi = new JButton("Help");
        
        nappula.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] options = { "Ei", "Kyllä" };
                int lopetus = JOptionPane.showOptionDialog(null, "Oletko varma että haluat lopettaa pelin?", "Exit", JOptionPane.DEFAULT_OPTION, JOptionPane.CANCEL_OPTION, null,options, options[0]);
                
                if (lopetus == 1){
                   System.exit(0);
                }
                
            }
            
        });
        
        helppi.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {  //Peliohjeet
                JOptionPane.showMessageDialog(frame, "Tervetuloa pelaamaan peliä Miinaharava!\n"
                        
                        , " Help", 1);
            }
            
        });
        final Karttanakyma a = this;
        panel.add(nappula);
        panel.add(helppi);
        this.add(panel, BorderLayout.SOUTH);
   
        
    }
    
}
