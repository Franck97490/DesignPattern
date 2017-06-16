/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExoChaine;

import Décorateur.DecorateurDeFacture;
import Décorateur.Facture;

/**
 *
 * @author franck
 */
public class Italique extends Balise {
        
    public Italique(Chaine c) {
        super(c);
    }
    public String improme () {
        return "<I>"+super.imprime()+"</I>";
        
    }
    
}