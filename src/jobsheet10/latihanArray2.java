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
public class latihanArray2 {
    public static void main(String[] args) {
        String cari;
        boolean temukan = false;
        String [] data = new String [] {"David","Agil","Jonathan","Farrel","Wayan","Reza"};
        Scanner mahal = new Scanner(System.in);
        System.out.print("Masukkan nama cogan yang kamu cari : ");
        cari = mahal.nextLine();
        for(int i = 0; i < data.length; i++) {
            if(cari.equals(data[i])){
            temukan = true;
            System.out.println("Cogan ditemukan pada index ke- " + i + " :) ");
        }
    }
    if(temukan != true) {
            System.out.println("Cogan tidak ditemukan :(");
            
        }
    }
}
        
        
        
        
    
    

