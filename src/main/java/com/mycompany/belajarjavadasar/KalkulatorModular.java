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
public class KalkulatorModular {
    static double tambah (double a, double b){
        return a+b;
    }
    static double kurang (double a, double b){
        return a-b;
    }
    static double kali (double a, double b){
        return a*b;
    }
    static double bagi (double a, double b){
        return a/b;
    }
    static void tampilMenu(){
        System.out.println("=== KALKULATOR MENU ===");
        System.out.println("1. Tambah (+)");
        System.out.println("2. kurang (-)");
        System.out.println("3. kali (*)");
        System.out.println("4. bagi (/)");
        System.out.println("5. Keluar");
        System.out.println("PILIH : ");
    }
    
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int pilihan;
        double a1, a2, hasil = 0 ;
        
        do {
            tampilMenu();
            pilihan = scan.nextInt();
            
            if (pilihan >=1 && pilihan <=4){
                System.out.print("Masukkan Angka ke-1: ");
                a1 = scan.nextDouble();
                System.out.print("Masukkan Angka ke-2: ");
                a2 = scan.nextDouble();
                
                if (pilihan == 1) hasil = tambah(a1,a2);
                else if (pilihan == 2) hasil = kurang(a1, a2);
                else if (pilihan == 3) hasil = kali(a1, a2);
                else if (pilihan == 4) hasil = bagi(a1, a2);
                System.out.println("hasil :"+hasil);
            } else if (pilihan == 5){
                System.out.println("TERIMA KASIH SUDAH MENGGUNAKAN PROGRAM");
            } else {
                System.out.println("PILIHAN SALAH, TELITI KEMBALI");
            }
        } while (pilihan != 5);
        scan.close();
    }
}
