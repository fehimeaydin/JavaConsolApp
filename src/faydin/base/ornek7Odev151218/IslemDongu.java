package faydin.base.ornek7Odev151218;
//15.12.2018 �devi

import java.util.Scanner;

public class IslemDongu {
	private int sayi;
	private int sayi2;
	private int sonuc;
	private Scanner scan;
	
	public IslemDongu() {
		scan = new Scanner(System.in);
		
		System.out.println("Bir say� giriniz...");
		sayi = scan.nextInt();
		System.out.println("Girdi�iniz say�: " + sayi);
		
		System.out.println("�kinci bir say� giriniz...");
		sayi2 = scan.nextInt();
		System.out.println("Girdi�iniz ikinci say�: " + sayi2);
		
		System.out.println("��lem se�iniz (+, -, *, /)");
		String islem = scan.next();
		System.out.println("Girdi�iniz isim: " + islem);
		
		
		
		switch (islem) {
		case "+":
			sonuc = sayi + sayi2;
			System.out.println(sayi +  " + " + sayi2 + " = " + sonuc);
			break;
		case "-":
			sonuc = sayi - sayi2;
			System.out.println(sayi +  " - " + sayi2 + " = " + sonuc);
			break;
		case "*":
			sonuc = sayi * sayi2;
			System.out.println(sayi +  " * " + sayi2 + " = " + sonuc);
			break;
		case "/":
			sonuc = sayi / sayi2;
			System.out.println(sayi +  " / " + sayi2 + " = " + sonuc);
			break;
		default:
			System.out.println("Hatal� i�lem se�imi yapt�n�z.");
			break;
			
		}
		
		
		
		scan.close();
	}


}
