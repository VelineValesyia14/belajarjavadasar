/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
public class RunMahasiswEnkapsulasi {
    public static void main (String[] args){
        MahasiswaEnkapsulasi mhs = new MahasiswaEnkapsulasi("velin", 20);
        System.out.println("Nama Awal: "+mhs.getNama());
        System.out.println("Mengubah nama menjadi Maddie...");
        mhs.setNama("Maddie");
       
        System.out.println("Mencoba set umur = -4...");
        mhs.setUmur(-4);
        
        System.out.println("Mencoba set umur = 20...");
        mhs.setUmur(20);
        
        mhs.tampilInfo();
    }
}
