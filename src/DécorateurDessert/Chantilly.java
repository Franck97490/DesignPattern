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
public class Chantilly extends DecorateurDessert {
    public Chantilly(Dessert d_c) {
        dessert = d_c;
    }
    
    @Override
    public String getNom() {
        return dessert.getNom()+" avec de la chantilly,";
    }
    
    @Override
    public double getPrix() {
        return dessert.getPrix()+0.50;
    }
}
