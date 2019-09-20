/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author asd
 */
import java.util.Scanner;
public class latihanArray1 {
    public static void main(String args []) {
        String cari;
        boolean temukan = false;
        String[] bunga = new String[]{"anggrek", "sakura" ,"sepatu","seratai","bougenville", "lotus"};
        Scanner baru = new Scanner(System.in);
        System.out.println("--NAMA-NAMA BUNGA--");
        System.out.print("Masukkan data yang ingin dicari : ");
        cari = baru.nextLine();
        for(int i=0; i < bunga.length; i++) {
            if(cari.equalsIgnoreCase(bunga[i])) {
                temukan= true;
                break;
            }
        }
        if(temukan == true) {
            System.out.println(" yeyyyy,Hasil ditemukan!");
        }else{
            System.out.println("Maaf,hasil tidak ditemukan!");
            
                
            }
        }
    }
    

