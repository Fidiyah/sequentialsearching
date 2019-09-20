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
public class tugasPraktikum1 {
    public static void main(String[] args) {
        int baru;
        int find = 0;
        int[]angka = new int[] {74,98,72,74,72,90,81,72};
        System.out.println("Data pada array");
        for(int i = 0; i<angka.length; i++) {
            System.out.print(angka[i] + "\t");
        }
        Scanner cerdas = new Scanner(System.in);
        System.out.print("\nMasukkan angka yang dicari : ");
        baru = cerdas.nextInt();
        for(int i =0; i < angka.length; i++) {
            if(baru == angka[i]){
                find++;
            
              
                
                
                
        
            }
        }
        System.out.println("Data yang dicari ditemukan sebanyak " + find + " kali ");
    
}

                
                
                
            }
        
    
    

