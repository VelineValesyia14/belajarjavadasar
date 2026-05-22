/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan12.latihan;

/**
 *
 * @author Hype
 */
public class Manajer extends Pegawai {
    private String departemen;
    public Manajer(String nama, int gaji, String departemen){
     super(nama,gaji);
     this.departemen = departemen;
    }
    
    public void tampilInfo(){
        System.out.println("=== MANAJER ===");
        super.tampilInfo();
        System.out.println("Departemen :"+departemen);
    }
}
