/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1;

import java.util.Scanner;

/**
 *
 * @author KANG_SNAKE
 */
public class Menghitung_luas_balok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("panjang balok : ");
        double panjang = input.nextDouble();
        System.out.println("lebar balok : ");
        double lebar = input.nextDouble();
        System.out.println("tinggi balok : ");
        double tinggi = input.nextDouble();
        double luas = (panjang*lebar*2)+(panjang*tinggi*2)+(lebar*tinggi*2);
        System.out.println("luas permukaan balok adalah = "+ luas);
        
    }
    
}
