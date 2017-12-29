/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viisitoistaPeli;

import java.util.Random;

public class Ruudukko {
    private final String[] alkutila;
    private String[] ruudukko;
    
    public Ruudukko() {
        this.alkutila = new String[] {"01","02","03","04","05","06","07","08",
                                      "09","10","11","12","13","14","15","  "};
        
        this.ruudukko = luoRuudukko();
    }
    
    private String[] luoRuudukko() {
        // Järjestää alkutilan satunnaiseen järjestykseen
        
        String[] uusiRuudukko = this.alkutila.clone();
        
        // "Fisher-Yates shuffle"
        Random rand = new Random();
        for (int i = uusiRuudukko.length - 1; i > 0; i -= 1) {
            int index = rand.nextInt(i + 1);
            String tmp = uusiRuudukko[index];
            uusiRuudukko[index] = uusiRuudukko[i];
            uusiRuudukko[i] = tmp;
        }
        
        return uusiRuudukko;
    }
    
    @Override
    public String toString() {
        String str = "";
        
        for (int i = 0; i < this.ruudukko.length; i += 1) {
            str += this.ruudukko[i] + " ";
            
            if ((i+1) % 4 == 0) {
                str += "\n";
            }
        }
        
        return str;
    }
}
