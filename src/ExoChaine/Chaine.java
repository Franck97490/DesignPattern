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
public class Chaine {
    private String texte;
    
    public Chaine () {}
    
    public Chaine (String t_c) {
        texte = t_c;
    }
    
    public String imprime() {
        return texte;
    }
}
