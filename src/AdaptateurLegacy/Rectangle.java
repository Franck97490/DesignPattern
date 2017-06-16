/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdaptateurLegacy;

/**
 *
 * @author franck
 */
public class Rectangle implements InterfaceShape {
    private LegacyRectangle r_a = new LegacyRectangle();
    
    public void draw(int x1, int y1, int x2, int y2) {
        r_a.draw(Math.min(x1,x2), Math.min(y1,y2), Math.abs(x2-x1), Math.abs(y2-y1));
    }
}
