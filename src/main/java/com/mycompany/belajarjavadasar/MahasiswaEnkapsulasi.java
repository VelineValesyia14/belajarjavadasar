/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
public class MahasiswaEnkapsulasi {
    private String nama;
    private int umur;
    
    public MahasiswaEnkapsulasi(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    
    public String getNama(){
        return nama;
    }
    public int getUmur(){
        return umur;
    }
    public void setNama(String namaBaru){
        this.nama = namaBaru;
    }
    public void setUmur(int UmurBaru){
        if (UmurBaru > 0){
            this.umur = UmurBaru;
        }else{
            System.out.println("Error : umur tidak boleh negatif atau nol!");
        }
    }
    public void tampilInfo(){
        System.out.println("Nama :"+nama+", Berumur: "+umur);
    }
}
