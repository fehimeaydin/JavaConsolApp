package faydin.base.ornek9Odev161218;

import java.util.Arrays;
import java.util.Scanner;

public class Odev {
	
	
	private Scanner scan;
	
	public Odev() {
		javaStringReverse();
		//javaSubstringComparisons();
		//javaSubarray();
		//calculator();
		
		
	}
	

	private void javaStringReverse() {
		scan = new Scanner(System.in);
		
		System.out.println("Kelime giriniz");
		String kelime = scan.next();
		System.out.println("Girdi�iniz kelime: " + kelime);
		
		
		
		char[] word = kelime.toCharArray();// girilen kelime uzunlu�unda bir char array olu�turuldu.
		char[] wordTemp = kelime.toCharArray(); // girilen kelime uzunlu�unda temp i�in bir array olu�turuldu.
		
		for(int i = 0; i< kelime.length(); i++) {
			
			
			System.out.println("Girdi�iniz kelime: " + word);
			
		}
		
		
		int count = word.length-1;
		
		for(int j=0; j< word.length; j++) {
			wordTemp[j] = word[count];
			count--;
			System.out.println(word[j] + " " +wordTemp[j]);
		}
		
		
		
	}

	private void javaSubstringComparisons() {
		int sayi;
		scan = new Scanner(System.in);
		
		
		System.out.println("Bir c�mle giriniz");
		String kelime = scan.next();
		System.out.println("Girdi�iniz c�mle: " + kelime);
		
		System.out.println("Ka� harften sonra b�l�ns�n (say� giriniz)");
		sayi = scan.nextInt();
		System.out.println("Girdi�iniz say�: " + sayi);
		
		String[] word = new String[kelime.length()];
		
		for(int i = 0; i< kelime.length(); i = i + sayi) { // girilen say� kadar artt�rma i�lemi yap�l�yor.
			
			word[i] =	kelime.substring(i,i+sayi);
			System.out.println("word["+i+"]= " + word[i]);
		}
		
		Arrays.sort(word);
		
		
	}
	
	private void javaSubarray() {
		
		
	}

	private void calculator() {
		
		int sayi;
		boolean durum = true;
		boolean devam = true;
		int sonuc=0;
		scan = new Scanner(System.in);
	
		

		do {
			
			
			do {
			
				System.out.println("Say�: " + sonuc);
				
				
				System.out.println("��lem se�iniz (+, -, *, /, =)");
				String islem = scan.next();
				System.out.println("Girdi�iniz islem: " + islem);
				
				
			    if(islem.equals("=")) {
			    	System.out.println("sonuc = " + sonuc);
					durum = false;
			    }
			    else {
			    	System.out.println("Bir say� giriniz...");
					sayi = scan.nextInt();
					System.out.println("Girdi�iniz say�: " + sayi);
					
				
					switch (islem) {
					case "+":
						sonuc += sayi;
						System.out.println("sonuc = " + sonuc);
						break;
					case "-":
						sonuc -= sayi;
						System.out.println("sonuc = " + sonuc);
						break;
					case "*":
						sonuc *= sayi;
						System.out.println("sonuc = " + sonuc);
						break;
					case "/":
						sonuc /= sayi;
						System.out.println("sonuc = " + sonuc);
						break;
					default:
						System.out.println("Hatal� i�lem se�imi yapt�n�z.");
						break;
						
					}
			    }
			
			}
		while(durum);
			
		System.out.println("Devam etmek istiyor musunuz? ( E / H)");
		String islem = scan.next();
		System.out.println("Girdi�iniz islem: " + islem);
		
			if(islem.equals("E")) {
				durum = true;
				devam = true;
			}
			else {
				System.out.println("��lem tamamland�. Sonuc = " + sonuc);
				devam = false;
				
			}	
			
		} while (devam);
			
		
		scan.close();
		
		
	}
	
}
