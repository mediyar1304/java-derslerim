public class deneme27 {

	public static void main (String [] args) {
	 	
	   String s1 = "Mustafa";
	   String s2 = new String("Mustafa");
	   String s3 = "Mustafa";
	   System.out.println(s2.length());
		
		System.out.println("0.indeksi:" + s2.charAt(0));
		System.out.println("1.indeksi:" + s2.charAt(1));
		System.out.println("2.indeksi:" + s2.charAt(2));
		System.out.println("3.indeksi:" + s2.charAt(3));
		System.out.println("4.indeksi:" + s2.charAt(4));
		System.out.println("5.indeks:" + s2.charAt(5));
		System.out.println("5.indeks:" + s2.charAt(s2.length()-1));
		
		System.out.println(s2.startsWith("Mu"));
		System.out.println(s2.endsWith("fa"));
		
        if(s1 == s2);	
		
		
		
	}	
}
