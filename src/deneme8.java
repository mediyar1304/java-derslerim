import java.util.Scanner;

public class deneme8 {

	public static void main (String[] args) { 
 // Mant�ksal Ko�ul   
 String sys_kul_ad� = "yaz�l�mbilimi";
 String parola = "12345";
 
 Scanner scan = new Scanner(System.in);
 System.out.println("Kullan�c� Ad�:");
 		
 String kullan�c�_ad� = scan.nextLine();
 System.out.println("Parola");
 
 String kul_parola = scan.nextLine();
 
 if  (!(sys_kul_ad�.equals(kullan�c�_ad�)) && !(parola.equals(kul_parola)))
 {
 System.out.println("Kullan�c� Ad� ve Parola Yanl��");
 }
 else   if  
	(sys_kul_ad�.equals(kullan�c�_ad�) && !(parola.equals(kul_parola)))
 {
 System.out.println("Parola Yanl��");
}
 else if  (!(sys_kul_ad�.equals(kullan�c�_ad�)) && (parola.equals(kul_parola))) 
 {
 System.out.println("Kullan�c� Ad� Yanl��");
}
 else  {
	System.out.println("Giri� Ba�ar�l�...");
}

 }
}
