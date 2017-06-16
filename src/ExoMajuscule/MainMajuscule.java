/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExoMajuscule;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author franck
 */
public class MainMajuscule {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try {
            BufferedReader br = new DécorateurFichier(new FileReader("C:\\Users\\franc\\OneDrive\\Documents\\Test.txt"));

            while (br.ready()) {
                System.out.println(br.readLine());

            }

            br.close();
        } catch (IOException ex) {
            System.out.println("Erreur lors de la lecture : " + ex.getMessage());
        }
    }
}
    
    
