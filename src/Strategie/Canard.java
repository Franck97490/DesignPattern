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
public abstract class Canard {
    private Vol maFaconDeVoler;
    
    public abstract void afficheToi();
    public void nage() {
        System.out.println("Je nage !!!");
    }
    public void faitCoinCoin () {
        System.out.println("Je vole !!!");
    }

    /**
     * @return the maFaconDeVoler
     */
    public Vol getMaFaconDeVoler() {
        return maFaconDeVoler;
    }

    /**
     * @param maFaconDeVoler the maFaconDeVoler to set
     */
    public void setMaFaconDeVoler(Vol maFaconDeVoler) {
        this.maFaconDeVoler = maFaconDeVoler;
    }
    
    public void envoleToi () {
        maFaconDeVoler.vole();
    }
}
