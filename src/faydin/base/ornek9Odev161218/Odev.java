package faydin.base.ornek9Odev161218;

import java.util.Arrays;
import java.util.Scanner;

public class Odev {
	
	
	private Scanner scan;
	
	public Odev() {
		//javaStringReverse();        // tamam
		//javaSubstringComparisons(); // ilk ve son deðeri döndürmek kaldý
		javaSubarray();             // 
		//calculator();               // tamam
		
		
	}
	

	private void javaStringReverse() {
		scan = new Scanner(System.in);
		int sayi = 0;
		
		System.out.println("Kelime giriniz");
		String kelime = scan.next();
		System.out.println("Girdiðiniz kelime: " + kelime);
		
		
		char[] word = kelime.toCharArray();// girilen kelime uzunluðunda bir char array oluþturuldu.
		char[] wordTemp = kelime.toCharArray(); // girilen kelime uzunluðunda temp için bir array oluþturuldu.
		

		int count = word.length-1;
		
		for(int j=0; j< word.length; j++) {
			wordTemp[j] = word[count];
			count--;
			System.out.println(word[j] + " " +wordTemp[j]);
		}
		
		for(int j=0; j< word.length; j++) {
			if(wordTemp[j] == word[j]) {
				sayi = 1;
			}
			else {
				sayi = 0;
			}
			count--;
		}
		
		if(sayi == 1) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Palindrome deðil");
		}
		
		
	}

	private void javaSubstringComparisons() {
		int sayi;
		scan = new Scanner(System.in);
		
		
		System.out.println("Bir cümle giriniz");
		String kelime = scan.next();
		System.out.println("Girdiðiniz cümle: " + kelime);
		
		System.out.println("Kaç harften sonra bölünsün (sayý giriniz)");
		sayi = scan.nextInt();
		System.out.println("Girdiðiniz sayý: " + sayi);
		
		String[] word = new String[100]; // sabit tanýmladým

		int count = word.length-1;
		
		for(int i = 0; i< kelime.length(); i++) { // girilen sayý kadar arttýrma iþlemi yapýlýyor.
			
			word[i] =	kelime.substring(i,i+sayi);
			System.out.println("word["+i+"]= " + word[i]);
		}
		
		Arrays.sort(word);
		
		for (int i = 0; i < kelime.length(); i++) {
			
			System.out.println(word[i]);
		}
		
		System.out.println("word[0]= " + word[0]);

		System.out.println("word["+ count +"]= " + word[count]);
		
		
	}
	
	private void javaSubarray() {
		
		Scanner scan = new Scanner(System.in);
        int size     = scan.nextInt();
        int[] array = new int[size];        
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        
        
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                int sum = 0;
                for (int j = i; j < array.length; j++) {
                    sum += array[j];
                    if (sum < 0) {
                        count++;
                    }
                }
            }
        
        System.out.println(count);
            
        scan.close();
	}

	private void calculator() {
		
		int sayi;
		boolean durum = true;
		boolean devam = true;
		int sonuc=0;
		scan = new Scanner(System.in);
	

		do {
			
			do {
			
				System.out.println("Sayý: " + sonuc);
				
				
				System.out.println("Ýþlem seçiniz (+, -, *, /, =)");
				String islem = scan.next();
				System.out.println("Girdiðiniz islem: " + islem);
				
				
			    if(islem.equals("=")) {
			    	System.out.println("sonuc = " + sonuc);
					durum = false;
			    }
			    else {
			    	System.out.println("Bir sayý giriniz...");
					sayi = scan.nextInt();
					System.out.println("Girdiðiniz sayý: " + sayi);
					
				
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
						System.out.println("Hatalý iþlem seçimi yaptýnýz.");
						break;
						
					}
			    }
			
			}
		while(durum);
			
		System.out.println("Devam etmek istiyor musunuz? ( E / H)");
		String islem = scan.next();
		System.out.println("Girdiðiniz islem: " + islem);
		
			if(islem.equals("E")) {
				durum = true;
				devam = true;
			}
			else {
				System.out.println("Ýþlem tamamlandý. Sonuc = " + sonuc);
				devam = false;
				
			}	
			
		} while (devam);
			
		scan.close();
		
	}
	
}
