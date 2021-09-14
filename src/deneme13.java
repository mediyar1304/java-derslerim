import java.util.Scanner;

public class deneme13 {
	
	public static void main (String[] args) {
		
		//Break ve Continue
		
		//Break: Döngüyü sona eririr.
		
		//Continue:Altýndaki iþlemleri yapmadan döngünün en baþýna gider.
		/*
		while(true) {
			Scanner scan = new Scanner(System.in);
			String s;
			
			System.out.println("Karakter giriniz:");
			s = scan.nextLine();
			
			if (s.equals("q")){
				System.out.println("Programdan çýkýlýyor...");
				break;
				}
				*/
		
		
		int i = 0;
		
		while(i < 10) {
			
			
			if (i == 4 || i == 7  ) {
				i++;
			continue;
			}
		System.out.println("i :" + i);
		        i++;
			
		}
		
		
	}

}
