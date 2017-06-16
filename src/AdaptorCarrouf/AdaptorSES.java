/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdaptorCarrouf;

/**
 *
 * @author franck
 */
public class AdaptorSES implements IChargeable {
    private PortableSonneEricSonne telephone;
    
    public AdaptorSES(PortableSonneEricSonne portable) {
        this.telephone = portable;
    }

    @Override
    public void Recharger(int volts) {
        this.telephone.ChargerBatteries(volts);
    }    
}
