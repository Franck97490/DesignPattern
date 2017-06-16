/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DécorateurDessert;

/**
 *
 * @author franck
 */
public class Chocolat extends DecorateurDessert {
    public Chocolat(Dessert d_ch){
        dessert = d_ch;
    }
    public String getNom() {
        return dessert.getNom()+" avec du chocolat,";
    }
    public double getPrix() {
        return dessert.getPrix()+0.20;
    }
    
}
