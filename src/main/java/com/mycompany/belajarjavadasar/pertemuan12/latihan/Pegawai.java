/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan12.latihan;

/**
 *
 * @author Hype
 */
public class Pegawai {
    protected String nama;
    protected int gaji;
    
    public Pegawai(String nama, int gaji){
        this.nama = nama;
        this.gaji = gaji;
    }
    public void tampilInfo(){
        System.out.println("Nama    :"+nama);
        System.out.println("Gaji    :"+gaji);
    }
    public int getGaji(){
        return gaji;
    }
    
}
