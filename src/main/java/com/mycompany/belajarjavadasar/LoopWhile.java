/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

import java.util.Scanner;

/**
 *
 * @author Hype
 */
public class LoopWhile {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int angkaRahasia = 7;
        int tebakan = 0;
        
        while (tebakan != angkaRahasia) {
            System.out.println("tebak angka (1-10):");
            tebakan = scan.nextInt();
            
            if (tebakan != angkaRahasia){
                System.out.println("salah, coba lagi.");
            }
        }
        System.out.println("benar! Angka rahasianya adalah "+ angkaRahasia);
        scan.close();
    }
}
