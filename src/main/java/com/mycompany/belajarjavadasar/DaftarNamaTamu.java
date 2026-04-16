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
public class DaftarNamaTamu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input jumlah tamu
        System.out.print("Masukkan jumlah tamu: ");
        int jumlahTamu = scanner.nextInt();
        scanner.nextLine(); // bersihkan newline

        // Array untuk menyimpan nama tamu
        String[] namaTamu = new String[jumlahTamu];

        // 2. Input nama tamu satu per satu
        for (int i = 0; i < jumlahTamu; i++) {
            System.out.print("Masukkan nama tamu ke-" + (i + 1) + ": ");
            namaTamu[i] = scanner.nextLine();
        }

        // 3. Tampilkan semua nama tamu
        System.out.println("\n=== Daftar Nama Tamu ===");
        for (int i = 0; i < jumlahTamu; i++) {
            System.out.println("Tamu " + (i + 1) + ": " + namaTamu[i]);
        }

        // 4. Hitung tamu yang namanya diawali huruf 'A'
        int hitungA = 0;
        for (int i = 0; i < jumlahTamu; i++) {
            if (namaTamu[i].startsWith("A")) {
                hitungA++;
            }
        }

        System.out.println("\nJumlah tamu dengan nama berawalan 'A': " + hitungA);

        scanner.close();
    }
}
