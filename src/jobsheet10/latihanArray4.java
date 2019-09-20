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
public class latihanArray4 {
    public static void main(String[] args) {
        Scanner pintar = new Scanner(System.in);
        String temukan;
        System.out.print("Masukkan sebuah kalimat/kata :");
        temukan = pintar.nextLine();
       
        int e =  0;
        for(int i = 0; i<temukan.length(); i++) {
            if(temukan.charAt(i) == 'e') {
                e++;
            }
        }
        System.out.println("Jumlah huruf e pada kalimat diatas adalah "+ e);
    }
    
}
