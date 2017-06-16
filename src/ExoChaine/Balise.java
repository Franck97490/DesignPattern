/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExoChaine;

/**
 *
 * @author franck
 */
public class Balise extends Chaine {
     Chaine texteDecore;
    
    public Balise(Chaine c) {
        texteDecore = c;
    }
    public String imprime() {
        return texteDecore.imprime();
    }
}
