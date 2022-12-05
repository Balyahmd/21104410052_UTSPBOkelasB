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
public class Penyayi{
    public static void main(String[] args) {
        Pop pop =  new Pop("Black Pink", "How You Like That");
        Dangdut dangdut = new Dangdut();
        
        pop.singer("Eclat Story");
        pop.song("Bentuk Cinta");
        pop.cetakLabel();
        
        String penyanyi;
        penyanyi = dangdut.penyanyi;
        dangdut.song("Kopi Dangdut");
        dangdut.CetakLabel();
    }
}
