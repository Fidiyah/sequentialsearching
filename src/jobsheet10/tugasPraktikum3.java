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
public class tugasPraktikum3 {
    public static void main(String[] args) {
       
        int[]data = new int[]{83,76,45,90,85,80,78,74};
        System.out.println("Data pada array");
        for(int i = 0; i<data.length; i++) {
            System.out.print(data[i]+"\t");
            
        }
        double ratarata = 0;
        for(int x = 0; x<data.length; x++)ratarata+=data[x];
        ratarata/=data.length;
        System.out.println("\nRata-rata nilai : " + ratarata);
        System.out.println("Nilai yang diatas rata-rata adalah : ");
        for(int y = 0; y<data.length; y++) {
            if(data[y] > ratarata){
                
                System.out.print(data[y] + "\t");
            }
            
            
        }
       
    }
    }

