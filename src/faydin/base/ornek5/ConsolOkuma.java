package faydin.base.ornek5;

import java.util.Scanner;

//15.12.2018
//Scanner


public class ConsolOkuma {
	private int sayi;
	private int sayi2;
	private Scanner scan;
	
	public ConsolOkuma() {
		scan = new Scanner(System.in);
		
		System.out.println("Bir sayý giriniz...");
		sayi = scan.nextInt();
		System.out.println("Girdiðiniz sayý: " + sayi);
		//System.out.println("Ýsminizi giriniz...");
		//String isim = scan.next();
		//System.out.println("Girdiðiniz isim: " + isim);
		System.out.println("Ýkinci bir sayý giriniz...");
		sayi2 = scan.nextInt();
		System.out.println("Girdiðiniz ikinci sayý: " + sayi2);
		
		int sonuc = sayi + sayi2;
		
		System.out.println("Girdiðiniz sayýlarýn toplamý: " + sonuc);
		
		
		
		scan.close();
	}

}
