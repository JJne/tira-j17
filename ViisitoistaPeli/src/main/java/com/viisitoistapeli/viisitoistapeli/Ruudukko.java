/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viisitoistapeli.viisitoistapeli;

import java.util.Random;

public class Ruudukko {
    private boolean test = false;
    
    // TODO:  Tee tästä 4×4 taulukko?
    private final String[] lopputila = {"01","02","03","04",
                                        "05","06","07","08",
                                        "09","10","11","12",
                                        "13","14","15","  "};
    private String[] ruudukko;
    
    public Ruudukko() {                
        this.ruudukko = luoRuudukko();
    }
    
    public Ruudukko(boolean test) {
        this.test = test;
        this.ruudukko = luoRuudukko();
    }
    
    
    private String[] luoRuudukko() {
        // Järjestää alkutilan satunnaiseen järjestykseen
        
        String[] uusiRuudukko = this.lopputila.clone();
        
        // "Fisher-Yates shuffle"
        Random rand = test ? new Random(1) : new Random();
   
        for (int i = uusiRuudukko.length - 1; i > 0; i -= 1) {
            int index = rand.nextInt(i + 1);
            String tmp = uusiRuudukko[index];
            uusiRuudukko[index] = uusiRuudukko[i];
            uusiRuudukko[i] = tmp;
        }
        
        return uusiRuudukko;
    }
    
    public int laskeRuudukonEtaisyysLopputilasta() {
        // Lasketaan yhteen jokaisen ruudun Manhattan-etäisyys sen lopputilan paikasta
        int etaisyys = 0;
        
        int x1 = 0;
        int y1 = 0;
        for (int i = 0; i < lopputila.length; i += 1) {
            
            int x2 = 0;
            int y2 = 0;
            for (int j = 0; j < ruudukko.length; j += 1) {
                if (lopputila[i].equals(ruudukko[j])) {
                    etaisyys += Math.abs(x1 - x2) + Math.abs(y1 - y2);
                    break;
                }
                
                if ((j+1) % 4 == 0) {
                    x2 = 0;
                    y2 += 1;
                } else {
                    x2 += 1;
                }
            }
            
            if ((i+1) % 4 == 0) {
                x1 = 0;
                y1 += 1;
            } else {
                x1 += 1;
            }
        }
        
        return etaisyys / 2;
    }
    
    public boolean onkoLopputilassa() {
        return laskeRuudukonEtaisyysLopputilasta() == 0;
    }
    
    public String[] getRuudukko() {
        return this.ruudukko;
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
