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
public class MainChaine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chaine c1 = new Chaine ("TEXTE");
        System.out.println(c1.imprime());
        Chaine c = new Gras(c1);
        System.out.println(c.imprime());        
        
    }
    
}
