package faydin.base.ornek8Dizi;
//16.12.2018 arrayler

public class Diziler {
	
	public Diziler() {
		//diziIslem();
		//diziler();
		//dizi2();
		//diziString();
		//cokBoyutlu();
		//cokBoyutluFor();
		cokBoyutlu2();
	}
	
	private void diziIslem() {
		// TODO Auto-generated method stub
		int[] dizi = new int[20];
		int[] dizi1 = {1,2,3,4,5};
		
		dizi[0]=4;
		
		for(int i=0; i< dizi.length; i++) {
			dizi[i] = i+2;
		}
		
		for(int i=0; i< dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		
		
	}
	
	private void diziler() {
		// TODO Auto-generated method stub
		
		int[] x = {1,2,3,4,5,6,7,8,9,10};
		int[] y = new int[10];
		
		
		/*for(int i=9; i>= 0; i--) {
			//System.out.println(x[i]);
			
			for(int j=0; j< y.length; j++) {
				y[j] = x[i];
				
				System.out.println(x[i] + " " + y[j]);
			}
			
		}
		//bi dizinin sondanbaþa doðru deðerlerini baþka bir diziye baþtan sona yazmak için kullanýldý.
		// ama çokladým. Alttaki for da çalýþan örneði var.
		*/
		
		int count = x.length-1;
		
		for(int j=0; j< x.length; j++) {
			y[j] = x[count];
			count--;
			System.out.println(x[j] + " " +y[j]);
		}
		
		
	}
	
	private void dizi2() {
		//diziyi tersten sýralama
		//bir diziyi tersten ayný diziye yazmak gerektiðinde, dizinin tempi alýnmazsa replace yapacak elemaný bulamayýz.
		
		int[] x = {1,2,3,4,5,6,7,8,9,10};
			
		int count = x.length-1;
		int temp;
		for(int j=0; j<x.length/2 ; j++) {
			temp = x[j];
			x[j] = x[count];
			x[count]=temp;
			count--;
		}
		
		for(int j=0; j<x.length; j++) {
			System.out.println(x[j]);
		}
		
		
	}
	
	private void diziString() {
		//sýnavlarda sorulabilir
		String[] isimler = {null};// new String[10];  // tek elemanlý array tanýmlandýðý için aþaðýda diðer elemanlarýna atama yapmasýna izin vermez.
		isimler[0] = "x";
		isimler[1] = "y";
		isimler[2] = "z";
		isimler[3] = "a";
		
		System.out.println(isimler[9]); // null
	}
	
	private void cokBoyutlu() {
		
		String[][] isimler =  new String[6][10]; 

		//String[][] isimler = {{}{}}; 
		isimler[0][0] = "hüseyin";
		isimler[0][4] = "fehime";
		isimler[0][2] = "dilan";
		isimler[0][7] = "ezgi";
		isimler[1][4] = "seda nur";
		isimler[4][5] = "tolga";
		isimler[5][6] = "cihan";
		//isimler[6][6] = "mustafa"; // index 0 dan baþladýðý için 6 yok, hata verir.
		
		System.out.println(isimler[0][0]);
		System.out.println(isimler[0][4]);
		System.out.println(isimler[0][2]);
		System.out.println(isimler[0][7]);
		System.out.println(isimler[1][4]);
		System.out.println(isimler[4][5]);
		System.out.println(isimler[4][6]); // null
		System.out.println(isimler[5][6]);
		//System.out.println(isimler[6][6]); 
	}
	
	private void cokBoyutluFor() {
		
		String[][] isimler =  new String[2][2]; 

		//String[][] isimler1 = {{"hüseyin", "fehime"},{"dilan","ezgi"}}; 
		isimler[0][0] = "hüseyin";
		isimler[0][1] = "fehime";
		isimler[1][0] = "dilan";
		isimler[1][1] = "ezgi";
		
		for(int i=0; i< isimler.length; i++) {
			
			for(int j=0; j< isimler[i].length; j++) {  // i.lenght önemli; o satýr için kaç kere döneceðini belirler.
				//System.out.print(isimler[i][j] + " " );
				
				System.out.println("isimler["+ i + "][" + j + "] = " +  isimler[i][j]);
			}
			//System.out.print("\n");
		}
		
	}
	
	private void cokBoyutlu2() {
		
		String[][] isimler =  new String[10][]; 

		//String[][] isimler1 = {{"hüseyin", "fehime"},{"dilan","ezgi"}}; 
		isimler[0] = new String[5];
		isimler[1] = new String[10];
				
		isimler[0][3] = "xxx";
		//isimler[5][2] = "yyy";
		
		System.out.println(isimler[0]); // RAM adresini verir. Deðer göstermez.
		System.out.println(isimler[1]);
		System.out.println(isimler[0][3]);
		//System.out.println(isimler[5][2]); // isimler[0] = new String[5]; satýrý  için bir sütun deðeri tanýmladýðý için bu satýr hata verir. 
										   //Çünkü  5 için herhangi bir tanýmlama mevcut deðil, oluþturulmadý. 
		System.out.println(isimler[2]); // null
		
		
		/**************Üç boyutlu array******************/
		
		String[][][] isimler2 =  new String[10][][]; 
		isimler2[0] = new String[5][];
		isimler2[0][0] = new String[100];
		
		
	}	
	

 
}
