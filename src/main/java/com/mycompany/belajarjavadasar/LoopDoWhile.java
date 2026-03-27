/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

import java.util.Scanner;

/**
 *
 * @author Hype
 */
public class LoopDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilihan = 0;

        do {
            System.out.println("\n === MENU APLIKASI === ");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Keluar");
            System.out.println("Pilih:");
            pilihan = scan.nextInt();

            switch(pilihan){
                case 1: System.out.println("DATA TELAH BERHASIL DITAMBAHKAN!"); break;
                case 2: System.out.println("MENAMPILKAN DATA"); break;
                case 3: System.out.println("TERIMA KASIH"); break;
                default: System.out.println("Pilihan tidak ada!");
            }
        } while (pilihan != 3);//untuk mengulang selama pilihan bukan keluar

        scan.close();
    }
}
