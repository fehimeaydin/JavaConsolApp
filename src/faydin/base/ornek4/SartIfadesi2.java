package faydin.base.ornek4;
//15.12.2018
//break koyulmasý gerekli.

public class SartIfadesi2 {
  public SartIfadesi2() {
	  Islem();
  }

  private void Islem() {
	int deger = 10;
	
	switch (deger) {
	case 0:
		System.out.println("Deðer 0");
		break;
	case 10:
		System.out.println("Deðer 10");
		break;
	case 20:
		System.out.println("Deðer 20");
		break;
	default:
		System.out.println("Deðer eþitlenmedi");
		break;
		
	}
	
  }
  
}
