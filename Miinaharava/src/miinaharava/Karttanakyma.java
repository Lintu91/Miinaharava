
package miinaharava;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Karttanakyma extends JPanel {
    
    private JButton taulukko[][] = new JButton[16][16];
    Graafinenkayttoliittyma gLiittyma;
    Logiikka logiikka;
    JFrame frame;
    Graafinenkayttoliittyma kayttis;

    Karttanakyma(Logiikka logiikka, Graafinenkayttoliittyma gLiittyma) {
        this.logiikka=logiikka;
        this.gLiittyma=gLiittyma;
        
        this.setLayout(new GridLayout(17,17));
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                if(i == 0 && j == 0) {
                    this.add(new JLabel(""));
                }
                else if (i==0 && j>0){
                    this.add(new JLabel(""));
                }
                else if (j==0 && i> 0){
                    this.add(new JLabel(""));
                } else {
                    JButton nappi = new JButton("");
                    this.add(nappi);
                    taulukko[j-1][i-1] = nappi;
                }
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
       
        JPanel panel = new JPanel();
        panel.add(nappula);
        panel.add(helppi);
        this.add(panel, BorderLayout.SOUTH);
        
    }
    
}
