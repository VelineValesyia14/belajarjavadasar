/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan13.latihan;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Hype
 */
public class KalkulatorPembagian {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int a1 = 0;
        int a2 = 0;
        boolean inputValid = false;
        
        System.out.println("=================================");
        System.out.println("       KALKULATOR PEMBAGIAN    ");
        System.out.println("=================================");
        
        while (!inputValid){
            System.out.print("Masukkan angka pertama : ");
            try {
                a1 = scanner.nextInt();
                inputValid = true;
            }catch (InputMismatchException e){
                System.out.println("ERROR : input bukan angka!");
                scanner.nextLine();
            }catch (ArithmeticException e){
                System.out.println("ERROR : "+ e.getMessage());
                scanner.nextLine();
            }
        }
        inputValid = false;
        while (!inputValid){
            System.out.print("Masukkan angka kedua : ");
            try {
                a2 = scanner.nextInt();
                if (a2==0){
                    System.out.println("Error : PEMBAGIAN TIDAK DIPERKENANKAN DENGAN NOL!");
                    scanner.nextLine();
                    continue;
                }
                int test = a1/a2;
                inputValid=true;
            } catch (InputMismatchException e){
                System.out.println("Error : INPUT HARUS ANGKA!");
                scanner.nextLine();;
            } catch (ArithmeticException e){
                System.out.println("Error : "+ e.getMessage());
                scanner.nextLine();
            }
        }
        int hasil = a1/a2;
        System.out.println("===================================");
        System.out.println("Hasil : " + a1 + "/" + a2 + "=" + hasil);
        System.out.println("===================================");
        
        scanner.close();
    }
}
