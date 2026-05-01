/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
public class RunPegawai {
    public static void main (String[] args){
        Pegawai pgw = new Pegawai ("Maddie", 3000000);
        System.out.println("== Pegawai Biasa ==");
        pgw.tampilInfo();
        
        System.out.println("\n");
        
        Manajer mnr = new Manajer ("Valesyia", 5000000, 2000000);
        System.out.println("== Pegawai Manajer ==");
        mnr.tampilInfo();
        
        Programmer pgr = new Programmer ("Veline", 3000000, 4000000);
        pgr.tampilInfo();
    }
}
