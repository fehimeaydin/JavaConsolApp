package faydin.base.ornek2;
//15.12.2018

public class Parametre {
	public Parametre() {
		String ad ="Fehime";
		String soyad= "Aydýn";
		String isimSoyisim = IsimSoyisim(ad,soyad);
		System.out.println(isimSoyisim);
	}

	private String IsimSoyisim(String ad, String soyad) {
		return ad + " " + soyad;
	}
	
	
}
