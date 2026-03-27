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
public class LoginSystem {
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
            
            if (user.equals("admin")&& pass.equals("123")){ // user : admin, pass:123
                loginSukses = true;
                System.out.println("SELAMAT DATAN, ADMIN!");
            }else{
                percobaan++;
                System.out.println("LOGIN GAGAL! Silahkan mencoba sebanyak :"+(3-percobaan)+ "\r");
            }
        }
        if (!loginSukses){
            System.out.println("AKUN DI BLOKIR KARENA TELAH MELEBIHI PERCOBAAN!");
        }
        scan.close();
    }
}
