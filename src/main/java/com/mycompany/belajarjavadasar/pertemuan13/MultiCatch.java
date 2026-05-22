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
public class MultiCatch {
    public static void main(String[]args){
        int[] a = {10,20,30};
        Scanner scan = new Scanner(System.in);
        
        try{
            System.out.println("Masukkan Index Array (0-2): ");
            int idx = scan.nextInt();
            System.out.println("Isi Array : "+a[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Index yang Anda masukkan tidak ada!");
        }catch (InputMismatchException e){
            System.out.println("Error : Input harus berupa angka!");
        }catch (Exception e){
            System.out.println("Terjadi Error umum: "+e.getMessage());
        }
        scan.close();
    }
}
