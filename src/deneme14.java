import java.util.Scanner;

// Fonksiyonlar(metodlar)
		/*
Eri�im_Belirleyici(Opsiyonel),Ekstra �zellikler,D�n��_Tipi,Fonksiyonun_Ad�,(Parametreler){
public                       ,   static        , void      , main          ,(String[] args)
		 
		 *Buras� fonksiyonun blo�u
		 *Fonksiyonun yapaca�� i�lemler burada olacak
		 
		 }
		 */
	/*	public class deneme14 {
			
	public static void selamlama() {
		
		System.out.println("Herkese Selam :)");
		System.out.println("Umar�m iyisinizdir :/");
	}
			
			
			
			
			
	public static void main (String[] args) {
		
		
		 selamlama(); //fonksiyon �a�r�s�
	*/



		public class deneme14 {
			
		public static void faktoriyel() {
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Say�");
			
		int say� = scan.nextInt();
		int faktoriyel = 1;
		
		while (say� > 0 ) {
			
		 faktoriyel *= say�;
		 say�--;
		 
		}
			System.out.println("Faktoriyel = " + faktoriyel);
		}
			
		public static void main (String[] args) {
		
			faktoriyel();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
	}
}