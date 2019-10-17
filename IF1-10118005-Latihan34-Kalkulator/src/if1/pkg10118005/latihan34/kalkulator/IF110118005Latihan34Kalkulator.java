/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author USER
* NAMA : Rycho Rantung
* KELAS : IF1
* NIM : 10118005
* Deskripsi Program : Berisi program kalkulator
 */
public class IF110118005Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kalkulator = new Kalkulator();
		System.out.println("===Aplikasi Kalkulator Bilangan===");
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan Angka ke-1 : ");
		kalkulator.value1 = sc.nextDouble();
		System.out.print("Masukkan Angke ke-2 : ");
		kalkulator.value2 = sc.nextDouble();
		System.out.println("\nHasil Pertambahan : " + kalkulator.tambahBilangan());
		System.out.println("Hasil Pengurangan : " + kalkulator.kurangBilangan());
		System.out.println("Hasil Perkalian : " + kalkulator.kaliBilangan());
		System.out.println("Hasil Pembagian : " + kalkulator.bagiBilangan());
		System.out.println("Hasil Sisa : " + kalkulator.sisaBilangan());
	}
	
    }
    

