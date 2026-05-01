/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
public class DemoArray2D {
    public static void main(String[] args) {
        int[][] angka = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}      
        };
       System.out.println("Data di Baris 0, Kolom 1: " + angka[0][1]);
       System.out.println("Data di Baris 2, Kolom 0: " + angka[2][0]);
       System.out.println("Jumlah Baris: " + angka.length);
       System.out.println("Jumlah Kolom: " + angka[0].length);

    }
}
