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
public class tugasPraktikum2 {
    public static void main(String[] args) {
        int angka;
        int find = 0;
        int[]data = new int[]{74,98,72,74,72,90,81,72};
        Scanner cerdas = new Scanner(System.in);
        System.out.println("Data pada array");
        for(int j = 0; j < data.length; j++){
            System.out.print(data[j] + "\t");
        }
        System.out.print("\nMasukkan angka yang ingin dicari : ");
        angka =cerdas.nextInt();
        for(int i = 0; i < data.length; i++) {
            if(angka == data[i]) {
                find++;
               
            }
        }
        
        if(find == 0) {
            System.out.println("Data tidak ditemukan!");
            }
        else {
            System.out.println("Data ditemukan sebanyak " + find + " kali");
        }
        }
        
    }
    

