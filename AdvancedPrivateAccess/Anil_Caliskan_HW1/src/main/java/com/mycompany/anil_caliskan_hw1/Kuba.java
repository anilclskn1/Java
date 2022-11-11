/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.anil_caliskan_hw1;

import java.util.Scanner;

/**
 *
 * @author Anıl
 */
public class Kuba {
    private Integer Currency;
    Convert cvt = new Convert();

    public void Add(Kuba newKuba) {
        String addition = cvt.convert_original(7, this.Currency+newKuba.Currency);
       System.out.println("2 Kuba Addition Result: "+addition);
    }
    
    public void Add(Galli newGalli) {
        Kuba newKuba = newGalli.Convert();
        int a = (newKuba.Currency + this.Currency) / 2;
        System.out.println(cvt.convert_original(9, newKuba.Currency / 2)+ " Galli Added "+cvt.convert_original(7, this.Currency)+" Kuba Equals "+cvt.convert_original(9, a)+" Galli");
    } 
    
    public void GetCurrency(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a currency for Kuba.\n=>");
        try{
          Integer newKuba = sc.nextInt();
        if (String.valueOf(newKuba).contains("9") || String.valueOf(newKuba).contains("8") || String.valueOf(newKuba).contains("7")) {
            System.out.println("Invalid number (9 or 8 or 7) for Kubaras. Exiting...");
            System.exit(0);
        }else {
            int convertedValue = cvt.convert_ten(7, newKuba);
            this.Currency = convertedValue; 
        }              
        }catch(Exception e){
            System.out.println("Wrong Format Typed From User...Exiting...");
            System.exit(0);
        }  
    }
    
    public void GetCurrency(Integer newKuba) {
        try{
          if (String.valueOf(newKuba).contains("9") || String.valueOf(newKuba).contains("8") || String.valueOf(newKuba).contains("7")) {
            System.out.println("Invalid number (9 or 8 or 7) for Kubaras. Exiting...");
            System.exit(0);
        }else {
            int convertedValue = cvt.convert_ten(7, newKuba);
            this.Currency = convertedValue;
        }           
        }catch(Exception e){
            System.out.println("Wrong Format Typed From User...Exiting...");
            System.exit(0);
        }
    }
    
    public void ShowCurrency() {
        System.out.println(cvt.convert_original(7, Currency));
    }
    
    public void Subtract(Kuba newKuba) {
        String substraction = cvt.convert_original(7, this.Currency - newKuba.Currency);
        System.out.println("2 Kuba Substraction Result: "+substraction);
    }
    
    public Galli Convert() {
        Galli newGalli = new Galli();
        int galliCurrency =  this.Currency / 2;
        String result = String.valueOf(cvt.convert_original(9, galliCurrency));
        newGalli.GetCurrency(Integer.valueOf(result));
        return newGalli; 
    }
}

