/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
public class RekeningBank {
    private String nomorRekening;
    private double saldo;
    
    public RekeningBank(String noRek, double SaldoAwal){
        this.nomorRekening = noRek;
        if (SaldoAwal >=0){
            this.saldo = SaldoAwal;
        } else {
            this.saldo = 0;
            System.out.println("SALDO AWAL TIDAK VALID! (di-set 0.)");
        }
    }
    public double getSaldo(){
        return saldo;
    }
    public void setor(double jumlah){
        if(jumlah>0){
            saldo = saldo + jumlah;
            System.out.println("Setor senilai Rp"+jumlah+"berhasil masuk ke rekening. Saldo saat ini :");
        } else {
            System.out.println("Jumlah setor harus positif!");
        }
    }
    public void tarik(double jumlah){
        if(jumlah > 0 && jumlah <= saldo ){
            saldo = saldo - jumlah;
            System.out.println("Tarik Tunai Rp"+jumlah+"Berhasil! Sisa Saldo Anda:"+saldo );
        } else {
            System.out.println("Penarikan gagal! Saldo tidak mencukupi atau jumlah invalid.");
        }
    }
}
