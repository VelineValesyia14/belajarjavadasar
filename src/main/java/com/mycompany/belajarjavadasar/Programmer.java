/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
public class Programmer {
    protected double bonus;
    protected String nama;
    protected double gajiPokok;
    
    public Programmer(String nama, double gajiPokok, double bonus){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.bonus = bonus;
    }
    
    public void tampilInfo(){
    System.out.println("--- DATA PROGRAMMER ---");
    System.out.println("Nama    : "+ nama);
    System.out.println("Gaji    : "+ gajiPokok);
    System.out.println("Bonus   : "+bonus);
    }
}
