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
    //Setup fields two 2D arrays for the 16 bit blocks of 4bit
    String [][] key;
    String [][] plainText = new String[1][1];
    
    
    //for(int i=0;i<2;i++){
            //for(int j=0;j<2;j++){
               // plainText[i][j] = "0000";
            //}
        //}
    
    Encryptor(String bitString){
        
        int l = 0;
        for(int i =0;i<plainText.length;i++){
            for(int j=0;j<plainText[i].length;j++){
                String temp = "";
                for(int k=0;k<4;k++){                    
                    temp += bitString.charAt(l);
                    l++;
                }
                plainText[i][j] = temp;
            }
        }
    }
    
    public String getTest(int a, int b){
        return plainText[a][b];
    }
    
    public String outputArray(){
        String output = "";
        for(int i=0;i<plainText.length;i++){
            for(int j=0;j<plainText[i].length;j++){
                for(int k=0;k<4;k++){
                  output += plainText[i][j].charAt(k);  
                }
                output += "\t";
            }
            output += "\n";
        }
        return output;
    }
}

