/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogerStratégie;

/**
 *
 * @author franck
 */
public class Logger {
    private String texte;
    
    public Logger () {}
    
    public Logger (String t_c) {
        texte = t_c;
    }
    
    public String imprime() {
        return texte;
    }
    
}
