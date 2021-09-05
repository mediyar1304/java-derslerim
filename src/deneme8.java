import java.util.Scanner;

public class deneme8 {

	public static void main (String[] args) { 
 // Mantýksal Koþul   
 String sys_kul_adý = "yazýlýmbilimi";
 String parola = "12345";
 
 Scanner scan = new Scanner(System.in);
 System.out.println("Kullanýcý Adý:");
 		
 String kullanýcý_adý = scan.nextLine();
 System.out.println("Parola");
 
 String kul_parola = scan.nextLine();
 
 if  (!(sys_kul_adý.equals(kullanýcý_adý)) && !(parola.equals(kul_parola)))
 {
 System.out.println("Kullanýcý Adý ve Parola Yanlýþ");
 }
 else   if  
	(sys_kul_adý.equals(kullanýcý_adý) && !(parola.equals(kul_parola)))
 {
 System.out.println("Parola Yanlýþ");
}
 else if  (!(sys_kul_adý.equals(kullanýcý_adý)) && (parola.equals(kul_parola))) 
 {
 System.out.println("Kullanýcý Adý Yanlýþ");
}
 else  {
	System.out.println("Giriþ Baþarýlý...");
}

 }
}
