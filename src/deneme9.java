import java.util.Scanner;

public class deneme9 {

	public static void main(String[] args) {
		
		// ATM �rnegi
		
		Scanner scan = new Scanner(System.in);
		int bakiye = 1000;
		int islem;
		
	
		System.out.println("1.Bakiye Sorgulama");
		System.out.println("2.Para Yat�rma");
		System.out.println("3.Para �ekme");
		System.out.println("4.Sistemden ��k��"); 
		
		islem = scan.nextInt();
		
		
	switch(islem) {
	case 1:
		System.out.println("Bakiyeniz " + bakiye +" tl dir");
		break;
	case 2:
		System.out.println("Ne kadar yat�racaks�n�z?");
	int miktar = scan.nextInt();
	
	bakiye +=miktar;
	System.out.println("Bakiyeniz " + bakiye +" tl dir");
	break;
	
	case 3:
		System.out.println("Ne kadar �ekeceksiniz?");
		miktar = scan.nextInt();
		
		bakiye -=miktar;
		
		System.out.println("Bakiyeniz " + bakiye +" tl dir");
		break;
	case 4:
		System.out.println("Sistemen ��k�l�yor...");
	    break;
	default :
		System.out.println("Ge�ersiz ��lem..");
	   break;
	
			
	}
	}
}
