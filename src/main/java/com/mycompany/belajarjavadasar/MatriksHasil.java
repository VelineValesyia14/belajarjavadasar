/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
public class MatriksHasil {
    public static void main (String[] args){
        int[][] matriksA = {
            {1, 4},
            {0, 4},
        };
        
        int [][] matriksB = {
            {2, 0},
            {0, 6},
        };
        int[][] matriksHasil = new int[2][2];
        
        //syarat penjumlahan : matriksHasil[i][j] = matriksA[i][j] + matriksB[i][j]
                for (int i  = 0; i <2; i++){
                    for (int j=0; j < 2; j++){
                        matriksHasil[i][j] = matriksA[i][j] + matriksB[i][j];
                    }
                }
                
                System.out.println("Matriks A: ");
                for (int i=0; i <2; i++){
                    for (int j=0; j < 2; j++){
                        System.out.print(matriksA[i][j]+" ");
                    }
                    System.out.println();
                }
                System.out.println("Matriks B: ");
                for (int i=0; i < 2; i++){
                    for (int j=0; j < 2; j++){
                        System.out.print(matriksB[i][j]+ " ");
                    }
                    System.out.println();
                }
                System.out.println("Hasil penjumlahan:");
                for (int i=0; i<2; i++){
                    for (int j=0; j<2; j++){
                        System.out.print(matriksHasil[i][j]+ " ");
                    }
                    System.out.println();
                }
    }
    
}
