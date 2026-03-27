/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
public class SegiTigaBintang {
    public static void main (String[] args){
        int tinggi = 5;
        
        for (int i=1; i<=tinggi; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
                
            }
            System.out.println(); // untuk mencetak garis baru
        }
    }
}
