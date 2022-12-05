/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Soal_1;

/**
 *
 * Nama  : Balya Ahmad Waffa,
 * NIM   : 21104410052,
 * Kelas : TI B,
 */
public class Dangdut {
    String penyanyi = "Ayu Ting Ting";
    String lagu = "Alamat Palsu";
    
    Dangdut(){
        
    }
    
    void singer(String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    public void song(String lagu){
        this.lagu = lagu;
    }
    
    void CetakLabel(){
        System.out.println(this.penyanyi + "<=>" + this.lagu);
    }
}
