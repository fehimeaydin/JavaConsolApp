package faydin.base.ornek7Odev151218;
//15.12.2018 ödevi

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
		
		System.out.println("Ýþlem seçiniz (+, -, *, /)");
		String islem = scan.next();
		System.out.println("Girdiðiniz isim: " + islem);
		
		
		
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
			System.out.println("Hatalý iþlem seçimi yaptýnýz.");
			break;
			
		}
		
		
		
		scan.close();
	}


}
