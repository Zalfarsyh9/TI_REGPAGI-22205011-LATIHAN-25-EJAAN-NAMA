/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.ti_regpagi22205011latihan25.zalfa.java;
import java.util.Scanner;
/**
 *
 * @author User
 Nama : Zalfa Rosiyah Riski 
 Nim : 22205011
 Jurusan : Teknik Informatika
 Deskripsi : Buatlah ejaan nama yang diinput yang berasal dari user berikut
 */
public class TI_REGPAGI22205011latihan25ZalfaJava {

    public static void main(String[] args) {
        //TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        boolean ulangi = true;
        while(ulangi){
            System.out.println("Masukan nama depan anda untuk dieja : ");
            String nama = input.next();
            
            System.out.println("Ejaan untuk "+nama +" adalah");
            
            int panjangNama = nama.length();
            for(int i = 0; i<panjangNama; i++) {
                char huruf = nama.charAt(i);
                System.out.println("Huruf ke-"+(i+1)+" : "+huruf);
            }
            System.out.println("Ulangi Aktifitas? (ya/tidak)");
            String ulang = input.next();
            if(ulang == "ya") {
                System.out.println("Program akan diulangi");
            }else if(ulang == "tidak"){
                System.out.println("Program berhenti terimaksih");
                ulangi = false;
        }
    }
}
}
