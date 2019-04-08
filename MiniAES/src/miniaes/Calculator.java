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
public class Calculator {
    Maps maps = new Maps();
    
    Calculator(){
        
    }
    
    //Needs coded
    public String[][] mixColumns(){
        String[][] temp = new String[1][1];
        temp[0][0] = "Hello";
        return temp;
    }
    
    //Coded needs tested
    public String[][] switchRows(String[][] array){    
        String temp = array[1][0];
        array[1][0] = array [1][1];
        array[1][1] = temp;
        return array;
    }
    
    //Needs coded
    public String nibbleSub(String nibble){
        return "String";
    }
    
    //Coded needs tested
    public String[][] addKey(String[][] array1, String[][] array2){
        for(int row = 0; row<array1.length; row++){
            for(int column = 0; column<array1[row].length; column++){
                array1[row][column] = nibbleXOR(array1[row][column],array2[row][column]);
            }
        }
        return array1;
    }
    
    //Coded needs tested
    public String arrayToString(String[][] array){
        String output = "";
        for(int row = 0; row<array.length; row++){
            for(int column = 0; column<array[row].length; column++){
                output += array[row][column];
            }
        }
        return output;
    }
    
    //Coded and tested and works
    public String[][] stringToArray(String bitString){
        int nibbleSize = 4;
        int bitStringPosition = 0;
        String[][] outputArray = {{"",""},{"",""}};
        for(int row = 0; row<outputArray.length; row++){
            for(int column = 0; column<outputArray[row].length; column++){
                for(int character = 0; character<nibbleSize; character++){
                    outputArray[row][column] += bitString.charAt(bitStringPosition);
                    bitStringPosition ++;
                }
            }
        }
        return outputArray;
    }
    
    //Coded needs tested
    public String nibbleXOR(String nibble1, String nibble2){
        String outputNibble = "";
        for(int i = 0; i<nibble1.length(); i++){
            if(nibble1.equals(nibble2)){
                outputNibble += 0;
            }
            else{
                outputNibble += 1;
            }
        }
        return outputNibble;
    }   
       
    //void convertToHex(){
        
    //}
    
    //void convertToBinary(){
        
    //}
    
}
