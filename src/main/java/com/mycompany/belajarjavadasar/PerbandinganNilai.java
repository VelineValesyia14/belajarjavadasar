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
public class PerbandinganNilai {
       public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        int nilai1, nilai2;
        
        System.out.println("Masukkan Nilai Pertama: ");
        nilai1 = input.nextInt();

        System.out.println("Masukkan Nilai Kedua: ");
        nilai2 = input.nextInt();
        
        System.out.println("\n--- Hasil Perbandingan ---");
        //hasilnya akan boolen (t/f)
        System.out.println("Apakah nilai 1 == nilai 2?"+ (nilai1 == nilai2));
        System.out.println("Apakah nilai 1 > nilai 2?"+ (nilai1 > nilai2));
        System.out.println("Apakah nilai 1 != nilai 2?"+ (nilai1 != nilai2));
        
        input.close();

    } 
}
