/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan12.latihan;

/**
 *
 * @author Hype
 */
public class Perusahaan {
    public static void main (String[]args){
    Pegawai[] daftarPegawai = new Pegawai [4];
    
    daftarPegawai[0] = new Manajer("Maddie", 14000000, "IT");
    daftarPegawai[1] = new Manajer("Cammeron", 9000000, "HRD");
    daftarPegawai[2] = new Programmer ("Velin", 45000000, "Java");
    daftarPegawai[3]= new Programmer ("Vale", 1200000, "Pascal");
    
    System.out.println("==================================");
    System.out.println("    DATA PEGAWAI PERUSAHAAN     ");
    System.out.println("==================================");
    
    for (Pegawai p: daftarPegawai){
        p.tampilInfo();
        if (p instanceof Manajer){
            System.out.println("Tugas   : Meeting");
        }else if (p instanceof Programmer){
            System.out.println("Tugas   : Coding");
        }
    }
    }
}
 