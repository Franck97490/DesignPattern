/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategie;

/**
 *
 * @author franck
 */
public class Colvert extends Canard {
    
    public Colvert() {
        setMaFaconDeVoler(new VolAvecAilles());
    }

    @Override
    public void afficheToi() {
        System.out.println("Je suis un Colvert !!!");
    }
    
}
