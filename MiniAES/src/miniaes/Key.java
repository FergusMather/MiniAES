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
public class Key {    
    String [][] keyZero = new String [2][2];
    String [][] keyOne = new String [2][2];
    String [][] keyTwo = new String [2][2];    
    Calculator calculator = new Calculator();
    
    //Needs coded
    Key(String userKey){        
        //generate key0 key1 and key2 from initial string
    }    
    
    //Needs coded
    public String[][] getKey(int num){
        //return key according to num
        String[][] temp = new String[1][1];
        temp[0][0] = "Hello";
        return temp;
    }
}
