/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan22.perhitunganlingkaran;
import java.util.Scanner;
/**
 *
 * * @author
 * NAMA			: Michael Nagaku Milenn Salim
 * KELAS		: IF-1
 * NIM			: 10118008
 * Deskripsi Program	: menghitung lingkaran 
 */
public class IF110118008Latihan22PerhitunganLingkaran {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		System.out.println("=======Perhitungan Lingkaran===========");
		System.out.print("Masukkan nilai diameter lingkaran : ");
		Scanner scanner = new Scanner(System.in);
		double diameter = 0;
		while (!scanner.hasNextDouble()){
			System.out.println("Nilai Diameter Tidak Sesuai");
			System.out.print("Masukkan nilai diameter lingkaran : ");
			scanner.next();
		}
		diameter = scanner.nextDouble();
		System.out.println("=======Hasil Perhitungan Lingkaran======");
		System.out.println("Jari-jari Lingkaran = " + (diameter/2) + " cm");
		System.out.println("Luas Lingkaran = " + (3.14*(diameter/2)*(diameter/2)) + " cm");
		System.out.println("Keliling Lingkaran = " + (3.14*diameter) + " cm");
	}
	
}
