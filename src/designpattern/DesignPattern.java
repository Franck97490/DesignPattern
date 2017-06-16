/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

import Strategie.Canard;
import Strategie.CanardEnBois;
import Strategie.Colvert;
import Strategie.Morillon;
import Strategie.VolAvecAilles;
import Décorateur.EnTete;
import Décorateur.Facture;
import Décorateur.FactureSimple;
import Décorateur.Pub;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author franck
 */
public class DesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Canard> canards = new ArrayList<>();
        canards.add(new Colvert());
        canards.add(new Morillon());
        Canard cb = new CanardEnBois();
        canards.add(cb);
        
        canards.stream().map((c) -> {
            c.afficheToi();
            return c;
        }).forEachOrdered((c) -> {
            c.envoleToi();
        });
        
        System.out.println("Canard en bois avec ailes mécaniques");
        cb.setMaFaconDeVoler(new VolAvecAilles());
        
        Facture f = new FactureSimple("Etudiant", new Date());
        f = new EnTete("ESPI bla bla", f);
        f = new Pub("Chez Casto...", f);
        f = new Pub("Chez DELL...", f);
        f.imprimeToi(); 
    }
    
}
