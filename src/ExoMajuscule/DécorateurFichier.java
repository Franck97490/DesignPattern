/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExoMajuscule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author franck
 */
public class DécorateurFichier extends BufferedReader {
    
    public DécorateurFichier(Reader in) {
        super(in);
    }
    
    @Override
    public String readLine () throws IOException {
        return super.readLine().toUpperCase();
    }
    
}
