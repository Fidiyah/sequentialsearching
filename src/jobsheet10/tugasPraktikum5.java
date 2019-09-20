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
public class tugasPraktikum5 {
    public static void main(String[] args) {
        Scanner mahal = new Scanner(System.in);
        String huruf;
        System.out.print("Masukkan sebuah kata/kalimat : ");
        huruf = mahal.nextLine();
        
        int a =  0;
        for(int y = 0; y<huruf.length(); y++) {
            if(huruf.charAt(y) == 'a') {
                a++;
          
            }
    }
        int b =  0;
        for(int j= 0; j<huruf.length(); j++) {
            if(huruf.charAt(j) == 'i') {
                b++;
            }
        }
        int c = 0;
        for(int k = 0; k<huruf.length(); k++) {
            if(huruf.charAt(k) == 'u') {
                c++;
            }
        }
        int d = 0;
        for(int x = 0; x<huruf.length(); x++) {
            if(huruf.charAt(x) == 'e') {
                d++;
            }
        }
        int e = 0;
        for(int z = 0; z<huruf.length(); z++) {
            if(huruf.charAt(z) == 'o') {
                e++;
            }
        }
        int f;
        f=a+b+c+d+e;
        System.out.println("Jumlah huruf a = " + a);
        System.out.println("Jumlah huruf i = " + b);
        System.out.println("Jumlah huruf u = " + c);
        System.out.println("Jumlah huruf e = " + d);
        System.out.println("Jumlah huruf o = " + e);
        System.out.println("jumlah semua huruf vokal = " + f);
        
        
         
}
    }

    

