public class deneme17 {
 // Metod Overloading
	/*
	public static void toplama(int a, int b, int c) {
		System.out.println("Toplamlarý:" + (a+b+c));
	}
	public static void toplama(int a, int b ) {
		System.out.println("Toplamlarý:" + (a+b));
	}
	public static void toplama(int a, int b, int c, int d) {
		System.out.println("Toplamlarý:" + (a+b+c+d));
	}
	public static void main (String[] args) {
		toplama(3,4,5);
		toplama(10,20);
		toplama(10,20,30,40);
	}
	*/
	
	public static void skorHesapla(String name, int score) {
		System.out.println(name + " isimli oyuncunun puaný: " + score);
	}
	
	public static void skorHesapla( int score) {
		System.out.println("Ýsimsiz oyuncunun puaný: " + score);	
	}
		public static void skorHesapla(String name) {
			System.out.println(name + " isimli oyuncunun puaný: 0 ");
		}
	public static void main(String[] args) {
		skorHesapla("Murat",3000);
		skorHesapla(1000);
		skorHesapla("Mustafa");
		
		
	}
	
	
	
}
