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
public class Encryptor {
    String plainText;
    Key key;
    Calculator calculator = new Calculator();
    
    Encryptor(String bitString, Key userKey){

    }
    
    /**
     *
     */
    public String encrypt(){
        calculator.addKey();
        calculator.nibbleSub();
        calculator.switchRows();
        calculator.mixColumns();
        return "String";    
    }
    
    
}

