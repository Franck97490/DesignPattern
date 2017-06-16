/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdaptateurLegacy;

import java.awt.Shape;

/**
 *
 * @author franck
 */
public class Line implements InterfaceShape {
    private LegacyLine l_a = new LegacyLine();
    
    @Override
    public void draw (int x1, int y1, int x2, int y2) {
        l_a.draw(x1, y1, x2, y2);
    }
}
