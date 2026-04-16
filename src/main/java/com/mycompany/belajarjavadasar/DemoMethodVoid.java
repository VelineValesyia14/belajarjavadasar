/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
public class DemoMethodVoid {
    static void garis(){
        System.out.println("===================");
    }
    static void sapaTeman(String nama) {
        System.out.println("Ni Haooo," +nama+ "! Selamt datang di java.");
    }
    public static void main(String[] args){
        garis(); 
        sapaTeman("Fina");
        sapaTeman("Kijem");
        sapaTeman("Rere");
        garis();
    }
}
