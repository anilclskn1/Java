/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.anil_caliskan_hw1;

/**
 *
 * @author Anıl
 */
public class Convert {
    
    
    public int convert_ten(int base, int num){
        String myNum = String.valueOf(num);
        int tenBaseEquivalent = 0;
        for(int i = 0; i < myNum.length() ; i++){
            tenBaseEquivalent += power(base, i) * Integer.parseInt(String.valueOf(myNum.charAt(myNum.length() - 1 - i)));
        }
        return tenBaseEquivalent;
    }
    
    public String convert_original(int base, int num){
            return Integer.toString(
            Integer.parseInt(String.valueOf(num), 10), base); 
    }
    
    public int power(int base, int pow) {
        if(base == 1) {
            return 1;
        }else if(pow == 1) {
            return base;
        }else if(pow == 0) {
            return 1;
        }else {
            return (power(base,pow - 1) * base);
        }
    } 
}
