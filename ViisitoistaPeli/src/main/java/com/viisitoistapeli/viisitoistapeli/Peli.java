/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viisitoistapeli.viisitoistapeli;

public final class Peli {
    private Ruudukko ruudukko;
    
    public Peli() {
        alusta();
    }
    
    public void alusta() {
        this.ruudukko = new Ruudukko();
    }
    
    public void ratkaise() {

    }
    
    private void haku() {
        
    }
    
    public Ruudukko getRuudukko() {
        return this.ruudukko;
    }
}
