import java.util.Scanner;

// Fonksiyonlar(metodlar)
		/*
Eriþim_Belirleyici(Opsiyonel),Ekstra Özellikler,Dönüþ_Tipi,Fonksiyonun_Adý,(Parametreler){
public                       ,   static        , void      , main          ,(String[] args)
		 
		 *Burasý fonksiyonun bloðu
		 *Fonksiyonun yapacaðý iþlemler burada olacak
		 
		 }
		 */
	/*	public class deneme14 {
			
	public static void selamlama() {
		
		System.out.println("Herkese Selam :)");
		System.out.println("Umarým iyisinizdir :/");
	}
			
			
			
			
			
	public static void main (String[] args) {
		
		
		 selamlama(); //fonksiyon çaðrýsý
	*/



		public class deneme14 {
			
		public static void faktoriyel() {
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sayý");
			
		int sayý = scan.nextInt();
		int faktoriyel = 1;
		
		while (sayý > 0 ) {
			
		 faktoriyel *= sayý;
		 sayý--;
		 
		}
			System.out.println("Faktoriyel = " + faktoriyel);
		}
			
		public static void main (String[] args) {
		
			faktoriyel();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
	}
}