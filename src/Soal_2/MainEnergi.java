/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Soal_2;

import java.util.Scanner;

/**
 *
 * Nama  : Balya Ahmad Waffa,
 * NIM   : 21104410052,
 * Kelas : TI B,
 */
public class MainEnergi {
    public static void main(String[] args) {
       Kinetic kinetic = new Kinetic();
       double m,v;
       final Scanner scanner= new Scanner(System.in);
       
        m = scanner.nextDouble();
        System.out.print("Masukkan Massa benda(Kg): " + m + "kg");
        v = scanner.nextDouble();
        System.out.print("Masukkan Kecepatan(m/s): "+ v + "m/s" + "\n");
        kinetic.setResult(m,v);
        System.out.println("Energi Kinetic: " + kinetic.getResult());
        
    }

}
