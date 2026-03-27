
package com.mycompany.belajarjavadasar;
import java.util.Scanner;
/**
 *
 * @author Hype
 */
public class RataRataNilai {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        int[] nilai;
        int jumlahData;
        double total = 0;
        double rataRata;
        
        System.out.print("Masukkan jumlah Mahasiswa:");
        jumlahData = scan.nextInt();
        
        nilai = new int[jumlahData];
        
        for (int i=0; i < jumlahData; i++){
                System.out.print("Nilai Mahasiswa ke-" + (i+1) + ":");
                nilai[i] = scan.nextInt();
                total +=nilai[i]; 
        
    }
    rataRata = total / jumlahData;
    
    System.out.println("\n===========================");
    System.out.println("Total Nilai : " +total);
    System.out.println("Rata-Rata   : " + rataRata);
    
    int max = nilai [0];
    int min = nilai [0];
    
    for (int i = 1; i < jumlahData; i++){
        if (nilai[i] > max) max = nilai[i];
        if (nilai[i] < min) min = nilai[i];
    }
    System.out.println("Nilai Tertinggi : " + max);
    System.out.println("Nilai Terendah  : " + min);
    
    scan.close();
    }
    
}
