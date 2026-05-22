/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan12.latihan;

/**
 *
 * @author Hype
 */
public class Programmer extends Pegawai {
    private String bahasaPemrograman;
    
    public Programmer (String nama, int gaji, String bahasaPemrograman){
        super(nama,gaji);
        this.bahasaPemrograman = bahasaPemrograman;
    } 
    public void tampilInfo(){
        System.out.println("=== PROGRAMMER ===");
        super.tampilInfo();
        System.out.println("Bahasa  :"+bahasaPemrograman);
    }
}
