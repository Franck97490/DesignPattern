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
public class LegacyMain {

    public static void main(String[] args) {
        InterfaceShape[] shapes = {new Line(), new Rectangle()};
        // A begin and end point from a graphical editor
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (int i = 0; i < shapes.length; ++i) {
            shapes[i].draw(x1, y1, x2, y2);
        }
    }
}
