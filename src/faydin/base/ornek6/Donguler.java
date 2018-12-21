package faydin.base.ornek6;
//15.12.2018
//for döngüsü


public class Donguler {
	
	private boolean durum = true;
	private int count =0;
	
	public Donguler() {
		
		dongu();
	//	Islem();
		
		
	}
	
	private void dongu() {
		
		//for (int i = 0; i <=20 ; i=i+1 ) {
		//	System.out.println(i);
		//}
		
		
		//for (int i = 100; i >= 0; i=i-1 ) {
		//	System.out.println(i);
		//}
		
		System.out.println("**********");
		while(durum) {
			System.out.println(count++);
			if(count==10) {
				durum=false;
			}
			
		}
		System.out.println("durum: " + durum);
		System.out.println("*****do while*****");
		do {
			System.out.println(count++);
		} while (durum);
		
	}
	
	
	private void Islem() {
		int sayi=10;
		System.out.println(sayi++); // yaz sonra arttýr 10 ---- sayi = 11
		sayi++;						//arttýr 12
		System.out.println(++sayi); //önce arttýr 13
		sayi--;						//azalt 12
		System.out.println(--sayi); // önce azalt sonra yazdýr 11
		System.out.println(sayi--); // önce yaz sonra eksilt 11 ---- sayi=10
		
	}
	
	
}
