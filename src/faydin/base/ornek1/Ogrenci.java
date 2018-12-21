package faydin.base.ornek1;
// 9.12.2018

public class Ogrenci {

	public Ogrenci() {
		sart();
		sart2();
		
		int a = 5;
		int b = 20;
		int sonuc = toplama(a,b);
	}
	
	private int toplama(int a, int b) {
		
		return a+b;
	}
	
	private void sart2() {
		
		int sayi = 3;
		if(sayi%2==1) {
			
		}
		if(sayi == 5) {
			
			sayi = sayi+1;
		}
		if(sayi == 3) {
			
			sayi = sayi - 1;
		}
		if(sayi == 2) {
			
			sayi = sayi * 6;
		}
		if(sayi == 20) {
			
			sayi = sayi / 7;
		}
		
		System.out.println(sayi);
		
	}
    private void sart() {
    	
    	int sayi = 3;
		
		if(sayi == 5) {
			
			sayi = sayi+1;
		}else if(sayi == 3) {
			
			sayi = sayi - 1;
		}else if(sayi == 2) {
			
			sayi = sayi * 6;
		}else if(sayi == 20) {
			
			sayi = sayi / 7;
		}
		
		System.out.println(sayi);
		
    	}
}

