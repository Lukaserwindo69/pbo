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
public class MenghitungLuasBola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Menghitung luas permukaan bola\nMasukan jari jari bola : ");
        Scanner input = new Scanner(System.in);
        double jari = input.nextDouble();
        System.out.println("Luas permukaan bola adalah : "+ jari*jari*22/7*4);
    }
    
}
