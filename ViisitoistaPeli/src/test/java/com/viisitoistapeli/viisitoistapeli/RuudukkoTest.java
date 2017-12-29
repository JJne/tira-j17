/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viisitoistapeli.viisitoistapeli;

import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RuudukkoTest {
    private Ruudukko ruudukko;
    
    public RuudukkoTest() {
    }
    
    @Before
    public void setUp() {
        this.ruudukko = new Ruudukko(true);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testGetRuudukko() {
        String[] expResult = new String[] {"11","06","01","13",
                                           "04","09","07","08",
                                           "15","05","  ","03",
                                           "10","02","14","12"};
        
        String[] result = ruudukko.getRuudukko();
        assertTrue(Arrays.equals(result, expResult));
    }
    
    @Test
    public void testLaskeRuudukonEtaisyysLopputilasta() {
        assertEquals(ruudukko.laskeRuudukonEtaisyysLopputilasta(), 18);
    }
    
    @Test
    public void testOnkoLopputilassa() {
        assertFalse(ruudukko.onkoLopputilassa());
    }

    @Test
    public void testToString() {
        String expResult = "11 06 01 13 \n04 09 07 08 \n15 05    03 \n10 02 14 12 \n";
        String result = ruudukko.toString();
        assertEquals(expResult, result);
    }
    
}
