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
public class latihanArray3 {
    public static void main(String[] args) {
        int max = 0;
        int[] angka = new int [] {-21,90,82,190,-190,24};
        System.out.println("Data pada array : ");
        for(int i = 0; i<angka.length; i++) {
            System.out.print(angka[i]+"\t");
            if(angka[i]>max) {
                max = angka[i];
            }
        }
        System.out.println("\n Data terbesar dari Array adalah " + max );
            }
        }
        
    
    

