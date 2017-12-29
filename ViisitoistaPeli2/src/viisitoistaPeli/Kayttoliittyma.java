/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viisitoistaPeli;

import java.util.Scanner;

public class Kayttoliittyma {
    private final Peli peli;

    public Kayttoliittyma(Peli peli) {
        this.peli = peli;
        kaynnista();
    }
    
    private void kaynnista() {
        System.out.println("== 15 Peli ==\n");
        
        while (true) {
            System.out.println("Uusi peli?");
            System.out.println(this.peli.getRuudukko());
            System.out.println("Paina [Enter] jatkaaksesi. Syötä 'q' ja paina [Enter] lopettaaksesi.");
            // Tulosta ruudukko
            
            Scanner lukija = new Scanner(System.in);
            String komento = lukija.nextLine();
            
            if (komento.equals("q")) {
                break;
            } else {
                this.peli.alusta();
                this.peli.ratkaise();
            }
        }
    }
}