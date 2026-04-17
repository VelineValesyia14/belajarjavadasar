/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
public class Product {
    private String namaProduk;
    private double harga;
    private int stok;
    
    public Product(String namaProduk, double harga, int stok){
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
    public String getNamaProduk(){
        return namaProduk;
    }
    public double getHarga(){
        return harga;
    }
    public int getStok(){
        return stok;
    }
    public void setStock(int stok){
        this.stok = stok;
    }
    public void tambahStok(int jumlah){
        stok = stok + jumlah;
    }
    public void kurangiStok(int jumlah){
        if(jumlah>stok){
            System.out.println("STOCK TIDAK MENCUKUPI!");
        } else {
            stok = stok - jumlah;
        }
    }
}
