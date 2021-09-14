import java.util.Scanner;

public class deneme11 {
	
		
		// Do While Döngüsü
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
		
		int sayý = scan.nextInt();
		int toplam = 0;
		
		do {
			
			toplam  +=  sayý  % 10;
			
			sayý = sayý  / 10;
			
			System.out.println(" Toplam " +  toplam  + " sayý = " + sayý);
			
			
		}
		while(sayý > 0);
		System.out.println(" Toplam = " + toplam );
		
		
		
		
		
		
		
		
		

		
		
		
	}
		 	


}
