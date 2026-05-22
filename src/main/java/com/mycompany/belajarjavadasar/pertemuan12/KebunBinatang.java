/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan12;

/**
 *
 * @author Hype
 */
public class KebunBinatang {
    public static void main(String[]args){
        Hewan[] kumpulanHewan = new Hewan[3];
        
        kumpulanHewan[0] = new Hewan();
        kumpulanHewan[1] = new Kucing();
        kumpulanHewan[2] = new Anjing();
        
        System.out.println("=== SIMFONI KEBUN BINATANG ===");
        for (Hewan h : kumpulanHewan){
            h.bersuara();
        }
    }
}
