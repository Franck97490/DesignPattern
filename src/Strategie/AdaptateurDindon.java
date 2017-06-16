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
public abstract class AdaptateurDindon extends Canard{
    Dindon d;

    public AdaptateurDindon(Dindon p_d) {
        d = p_d;
    }
    public void vole () {
        d.deplaceToi();
    }
    
    
}
