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
		
		System.out.println("Bir say� giriniz...");
		sayi = scan.nextInt();
		System.out.println("Girdi�iniz say�: " + sayi);
		//System.out.println("�sminizi giriniz...");
		//String isim = scan.next();
		//System.out.println("Girdi�iniz isim: " + isim);
		System.out.println("�kinci bir say� giriniz...");
		sayi2 = scan.nextInt();
		System.out.println("Girdi�iniz ikinci say�: " + sayi2);
		
		int sonuc = sayi + sayi2;
		
		System.out.println("Girdi�iniz say�lar�n toplam�: " + sonuc);
		
		
		
		scan.close();
	}

}
