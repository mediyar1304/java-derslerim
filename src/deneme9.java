import java.util.Scanner;

public class deneme9 {

	public static void main(String[] args) {
		
		// ATM Örnegi
		
		Scanner scan = new Scanner(System.in);
		int bakiye = 1000;
		int islem;
		
	
		System.out.println("1.Bakiye Sorgulama");
		System.out.println("2.Para Yatýrma");
		System.out.println("3.Para Çekme");
		System.out.println("4.Sistemden Çýkýþ"); 
		
		islem = scan.nextInt();
		
		
	switch(islem) {
	case 1:
		System.out.println("Bakiyeniz " + bakiye +" tl dir");
		break;
	case 2:
		System.out.println("Ne kadar yatýracaksýnýz?");
	int miktar = scan.nextInt();
	
	bakiye +=miktar;
	System.out.println("Bakiyeniz " + bakiye +" tl dir");
	break;
	
	case 3:
		System.out.println("Ne kadar çekeceksiniz?");
		miktar = scan.nextInt();
		
		bakiye -=miktar;
		
		System.out.println("Bakiyeniz " + bakiye +" tl dir");
		break;
	case 4:
		System.out.println("Sistemen Çýkýlýyor...");
	    break;
	default :
		System.out.println("Geçersiz Ýþlem..");
	   break;
	
			
	}
	}
}
