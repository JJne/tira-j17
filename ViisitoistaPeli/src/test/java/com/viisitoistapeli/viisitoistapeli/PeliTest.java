/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viisitoistapeli.viisitoistapeli;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PeliTest {
    private Peli peli;
    
    public PeliTest() {
    }
    
    @Before
    public void setUp() {
        this.peli = new Peli();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAlusta() {
        Ruudukko nykyinenRuudukko = peli.getRuudukko();
        peli.alusta();
        Ruudukko uusiRuudukko = peli.getRuudukko();
        
        assertNotEquals(nykyinenRuudukko, uusiRuudukko);
    }

    //@Test
    public void testRatkaise() {
        
    }
}
