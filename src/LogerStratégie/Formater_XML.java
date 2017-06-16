/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogerStratégie;

/**
 *
 * @author franck
 */
public class Formater_XML implements IFormater {

    @Override
    public String format(String message) {
        System.out.println("<XML><Message>"+message+"</Message></XML>");
        return null;
    }
    
}
