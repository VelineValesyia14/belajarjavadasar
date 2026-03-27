package com.mycompany.belajarjavadasar;

import java.util.Scanner;
/**
 *
 * @author Hype
 */
public class LatihanPertemuan1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double gajiPokok, tunjangan, pajak, gajiBersih;
        
        System.out.println("Masukkan Gaji pokok : Rp");
        gajiPokok = input.nextDouble();
        
        // proses aritmatika 
        tunjangan = 0.2 * gajiPokok; // 20%
        pajak = 0.05 * (gajiPokok + tunjangan); // 5%
        gajiBersih = gajiPokok + tunjangan - pajak;
        
        System.out.println("\n=== SLIP GAJI ===");
        System.out.println("Gaji Pokok     : Rp"+gajiPokok);
        System.out.println("Tunjangan      : Rp"+tunjangan);
        System.out.println("Pajak          : Rp"+pajak);
        System.out.println("------------------------------");
        System.out.println("Gaji Bersih     : Rp"+gajiBersih);
        
        input.close();
     }
}
