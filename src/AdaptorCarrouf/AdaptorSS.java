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
public class AdaptorSS implements IChargeable {
    
        private PortableSamSaoule telephone;
    
    public AdaptorSS(PortableSamSaoule portable) {
        this.telephone = portable;
    }

    @Override
    public void Recharger(int volts) {
        int nouveauVoltage = volts > 5 ? 5 : volts;
        this.telephone.ChargerPortable(nouveauVoltage);
    }
    
}
