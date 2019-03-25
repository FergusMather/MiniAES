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
public class Block {
    String nibble0;
    String nibble1;
    String nibble2;
    String nibble3;
    
    Block(String makeNib0, String makeNib1, String makeNib2, String makeNib3){
        this.nibble0 = makeNib0;
        this.nibble1 = makeNib1;
        this.nibble2 = makeNib2;
        this.nibble3 = makeNib3;        
    }
    
    String getNib0(){
        return nibble0;
    }
    
    String getNib1(){
        return nibble1;
    }
    
    String getNib2(){
        return nibble2;
    }
    
    String getNib3(){
        return nibble3;
    }
    
    void addBlock(Block addingBlock){
        String tempNib0 = "";
        for(int i =0; i<4; i++){
            if(this.nibble0.charAt(i) == addingBlock.getNib0().charAt(i)){
                tempNib0 += "0";
            }
            else{
                tempNib0 += "1";
            }
        }
        this.nibble0 = tempNib0;
        String tempNib1 = "";
        for(int i =0; i<4; i++){
            if(this.nibble1.charAt(i) == addingBlock.getNib1().charAt(i)){
                tempNib1 += "0";
            }
            else{
                tempNib1 += "1";
            }
        }
        this.nibble1 = tempNib0;
        String tempNib2 = "";
        for(int i =0; i<4; i++){
            if(this.nibble2.charAt(i) == addingBlock.getNib2().charAt(i)){
                tempNib2 += "0";
            }
            else{
                tempNib2 += "1";
            }
        }
        this.nibble2 = tempNib2;
        String tempNib3 = "";
        for(int i =0; i<4; i++){
            if(this.nibble3.charAt(i) == addingBlock.getNib3().charAt(i)){
                tempNib3 += "0";
            }
            else{
                tempNib3 += "1";
            }
        }
        this.nibble3 = tempNib3;
        }
    
    Block keyOne(Block thisBlock){
        
    }
    
    Block keyTwo(Block thisBlock){
    
    }
