/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan13;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Hype
 */
public class InputAman {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        try{
            System.out.print("Masukkan angka bulat :");
            int a = scan.nextInt();
            System.out.println("Angka yang Anda masukkan: "+a);
        } catch (InputMismatchException e){
            System.out.println("ERROR : input harus berupa angka, bukan huruf!");
        } finally {
            System.out.println("BLOK FINALLY : SELESAI!");
            scan.close();
        }
    }
    
}
