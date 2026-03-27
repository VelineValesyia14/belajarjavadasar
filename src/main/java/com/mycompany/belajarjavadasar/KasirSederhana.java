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
public class KasirSederhana {
     public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        String user, pass;
        boolean loginSukses = false;
        int percobaan = 0;
        
        while (percobaan < 3 && !loginSukses){
            System.out.println("--- LOGIN ----");
            System.out.println("Username:");
            user = scan.nextLine();
            System.out.println("Password:");
            pass = scan.nextLine();
            
            if (user.equals("admin")&& pass.equals("1234")){ // user : admin, pass:1234
                loginSukses = true;
                System.out.println("SELAMAT DATANG, ADMIN!");
            } else {
                percobaan++;
                System.out.println("LOGIN GAGAL! Silahkan mencoba sebanyak :"+(3-percobaan)+ "\r");
            }
        }
        if (loginSukses){ 
            System.out.println(" === KASIR ADMIN === ");
            int total = 0;
            char jawaban;
            
            do {
                System.out.println("Masukkan Harga Barang: ");
                int harga = scan.nextInt();
                total = total + harga;
                
                System.out.println("Adakah barang lain? (Y/T):");
                jawaban = scan.next().charAt(0);           
            } while (jawaban == 'y');
            System.out.println("=============================");
            System.out.println("Total harga: Rp " + total);
            System.out.println("SELESAI! TERIMAKASIH SAMPAI JUMPA KEMBALI");
        } else {
            System.out.println("AKUN DI BLOKIR KARENA TELAH MELEBIHI PERCOBAAN!");
        }
        scan.close();
    }
}
