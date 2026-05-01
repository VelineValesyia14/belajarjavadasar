/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
public class RunMahasiswa {
    public static void main(String[] args){
        Mahasiswa mhs1 = new Mahasiswa("Tora Tora", "2213039", 3.5);
        Mahasiswa mhs2 = new Mahasiswa("This is Me and The Sky", "28940484", 3.3);
        
        mhs1.tampilInfo();
        mhs2.tampilInfo();
        
        System.out.println("IPK "+ mhs1.nama+" adalah"+mhs1.ipk);
        
        mhs1.belajar();
        mhs2.belajar();
    }
}
