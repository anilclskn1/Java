/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.anil_caliskan_hw1;


/**
 *
 * @author Anıl
 */
public class Anil_Caliskan_HW1 {

    public static void main(String[] args) { 
        Galli firstGalli = new Galli();
        firstGalli.GetCurrency();
        Galli secondGalli = new Galli();
        secondGalli.GetCurrency();
        Kuba firstKuba= new Kuba();
        firstKuba.GetCurrency();
        Kuba secondKuba = new Kuba();
        secondKuba.GetCurrency();
       
        firstKuba.Add(firstGalli);
        
        firstGalli.ShowCurrency();
        
    }    
}
