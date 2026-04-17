/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
public class Laptopn {
    String merk;
    String warna;
    int harga;
    
    public Laptopn(String merk, String warna, int harga){
        this.merk = merk;
        this.harga = harga;
        this.warna = warna; 
    }
    public void tampilSpek(){
        System.out.println("Merk  : "+merk); 
        System.out.println("Warna : "+warna);
        System.out.println("Harga : "+harga);
    }
    public int diskon(int persen){
        return harga - (harga*persen/100);
    }
}
