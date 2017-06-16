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
public class MainDessert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dessert g1 = new Gaufre();
                g1 = new Chocolat(g1);
                g1 = new Chantilly(g1);
                g1 = new Chocolat(g1);
                System.out.println(g1);
                
        Dessert c1 = new Crepe();
                c1 = new Chocolat(c1);
                c1 = new Chocolat(c1);
                System.out.println(c1);
    }
    
}
