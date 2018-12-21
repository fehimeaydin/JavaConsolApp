package faydin.base.ornek7Odev;

import java.util.Scanner;

public class IslemDongu {
	private int sayi;
	private int sayi2;
	private int sonuc;

	private Scanner scan;
	
	public IslemDongu() {
		scan = new Scanner(System.in);
		
		System.out.println("Bir sayý giriniz...");
		sayi = scan.nextInt();
		System.out.println("Girdiðiniz sayý: " + sayi);
		
		System.out.println("Ýkinci bir sayý giriniz...");
		sayi2 = scan.nextInt();
		System.out.println("Girdiðiniz ikinci sayý: " + sayi2);
		
		System.out.println("Ýþlem seçiniz (+, - , * , /)");
		String islem = scan.next();
		System.out.println("Ýþleminiz: " + islem);
		
		
		
		
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
			System.out.println("Hatalý iþlem");
			break;
		
		}
		scan.close();
}
}
