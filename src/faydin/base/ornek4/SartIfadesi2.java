package faydin.base.ornek4;
//15.12.2018
//break koyulmas� gerekli.

public class SartIfadesi2 {
  public SartIfadesi2() {
	  Islem();
  }

  private void Islem() {
	int deger = 10;
	
	switch (deger) {
	case 0:
		System.out.println("De�er 0");
		break;
	case 10:
		System.out.println("De�er 10");
		break;
	case 20:
		System.out.println("De�er 20");
		break;
	default:
		System.out.println("De�er e�itlenmedi");
		break;
		
	}
	
  }
  
}
