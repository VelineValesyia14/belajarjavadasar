/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
public class DemoMethodReturn {
    static int hitungLuas(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil; 
    }
    static boolean isGenap(int angka){
        if (angka %2==0){
            return true;
        } else {
            return false;
        }   
    }
    public static void main(String[] args){
        int luas = hitungLuas(14,6);
        System.out.println("Luas Persegi panjang: "+luas);
        System.out.println("Luas lain: "+hitungLuas(4,5));
        int nilai = 10;
        if (isGenap(nilai)){
            System.out.println(nilai+"adalah GENAP");
        } else {
            System.out.println(nilai+"adalah GANJIL");
        }
    }
    
}
