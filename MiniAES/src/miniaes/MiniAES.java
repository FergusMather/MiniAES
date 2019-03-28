/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniaes;

/**
 *
 * @author 1812962
 */
public class MiniAES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Encryptor encrypt = new Encryptor("1010101010101010");
        System.out.println(encrypt.outputArray());        
    }    
}
