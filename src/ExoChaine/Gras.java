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
public class Gras extends Balise {
        
    public Gras(Chaine c) {
        super(c);
    }
    public String improme () {
        return "<B>"+super.imprime()+"</B>";
        
    }
    
}
