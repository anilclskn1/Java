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
public class Galli {
    private Integer Currency;
    Convert cvt = new Convert();
    

    
    public void Add(Galli newGalli) {
       String addition = cvt.convert_original(9, this.Currency+newGalli.Currency);
       System.out.println("2 Galli Addition Result: "+addition);
    }
    
    public void Add(Kuba newKuba) {
        Galli newGalli = newKuba.Convert();
        int a = (newGalli.Currency + this.Currency) * 2;
        System.out.println(cvt.convert_original(7, newGalli.Currency * 2)+ " Kuba Added "+cvt.convert_original(9, this.Currency)+" Galli Equals "+cvt.convert_original(7, a)+" Kuba");
        
    }
 
    
    public void GetCurrency(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a currency for Galli.\n=>");
        try{
         Integer newGalli = sc.nextInt();
          if (String.valueOf(newGalli).contains("9")) {
            System.out.println("Invalid number (9) for Gallions. Exiting...");
            System.exit(0);
        }else {
            int convertedValue = cvt.convert_ten(9, newGalli);
            this.Currency = convertedValue; 
        }    

        }catch(Exception e) {
            System.out.println("Wrong Format Typed From User...Exiting...");
            System.exit(0);
        }
       
    }
    
    public void GetCurrency(Integer newGalli) {
        try{
            if (String.valueOf(newGalli).contains("9")) {
            System.out.println("Invalid number (9) for Gallions. Exiting...");
            System.exit(0);
        }else {
            int convertedValue = cvt.convert_ten(9, newGalli);
            this.Currency = convertedValue;
        }
        }catch(Exception e){
            System.out.println("Wrong Format Typed From User...Exiting...");
            System.exit(0);
        }
    }
    
    public void ShowCurrency() {
        System.out.println("Galli Currency "+cvt.convert_original(9, Currency));
    }
    
    public void Subtract(Galli newGalli) {
        String substraction = cvt.convert_original(9, this.Currency - newGalli.Currency);
        System.out.println("2 Galli Substraction Result: "+substraction);
    }
    
    public Kuba Convert() {
        Kuba newKuba = new Kuba();
        int kubaCurrency =  this.Currency * 2;
        String result = String.valueOf(cvt.convert_original(7, kubaCurrency));
        newKuba.GetCurrency(Integer.valueOf(result));
        return newKuba;
    }
}

