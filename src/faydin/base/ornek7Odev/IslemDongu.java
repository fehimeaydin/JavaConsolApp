package faydin.base.ornek7Odev;

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
		
		System.out.println("��lem se�iniz (+, - , * , /)");
		String islem = scan.next();
		System.out.println("��leminiz: " + islem);
		
		
		
		
		switch(islem) {
		case "+":   sonuc = sayi + sayi2;
			System.out.println("Sonuc: " + sonuc); break;
		case "-":  sonuc = sayi - sayi2;
			System.out.println("Sonuc: " + sonuc); break;
		case "*":   sonuc = sayi * sayi2;
			System.out.println("Sonuc: " + sonuc);break;
		case "/":   sonuc = sayi / sayi2;
			System.out.println("Sonuc: " + sonuc);break;
		default:
			System.out.println("Hatal� i�lem");
			break;
		
		}
		scan.close();
}
}
