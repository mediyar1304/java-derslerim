import java.util.Scanner;

public class deneme11 {
	
		
		// Do While D�ng�s�
		/*
		 * int n = 10;
		do {
			System.out.println("n=" + n);
		
		
		n--;
		
		}
		
		while(n> 0);
		 */
	
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int say� = scan.nextInt();
		int toplam = 0;
		
		do {
			
			toplam  +=  say�  % 10;
			
			say� = say�  / 10;
			
			System.out.println(" Toplam " +  toplam  + " say� = " + say�);
			
			
		}
		while(say� > 0);
		System.out.println(" Toplam = " + toplam );
		
		
		
		
		
		
		
		
		

		
		
		
	}
		 	


}
