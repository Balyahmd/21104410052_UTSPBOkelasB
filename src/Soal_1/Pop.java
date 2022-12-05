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
public class Pop {
    String penyanyi;
    String lagu;
//    
//    Pop(){
//        
//    }
//    
    Pop(String penyanyi, String lagu){
        this.penyanyi = penyanyi;
        this.lagu = lagu;
        System.out.println(this.penyanyi + "<=>" + this.lagu);
    }
    
    public void singer(String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    public void song(String lagu){
        this.lagu = lagu;
    }
    
    void cetakLabel(){
        System.out.println(this.penyanyi + "<=>" + this.lagu);
    }
}
