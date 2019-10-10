/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan25.ejaannama;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = scan.nextLine();
        System.out.println("\nEjaan untuk \"" + nama + "\" adalah : ");
        char eja[] = nama.toCharArray();
        
        for(int i = 0; i <= (eja.length - 1); i++){
            System.out.println("Huruf ke-" + (i + 1) + " : " + eja[i] );
        }
        System.out.println("");
    }
    
}
