import java.util.ArrayList;

public class deneme25 {

	public static void main (String [] args) {
		
		
		ArrayList<String> groups = new ArrayList<String>();
		int[] arr = {10,20,30,40,50};
		groups.add("Metallica");
		groups.add("Iron Maiden");
		groups.add("Guns' n Roses");
		groups.add("Black Sabbath");
		
		System.out.println(groups.indexOf("Metallica"));
		System.out.println(groups.indexOf("Black Sabbath"));
		
		
		
		/*System.out.println("0.indeks:" + groups.get(0));
		System.out.println("1.indeks:" + groups.get(1));
		System.out.println("2.indeks:" + groups.get(2));
		System.out.println("3.indeks:" + groups.get(3));*/
		
		//System.out.println("Arraylist uzunluk: " + groups.size());
	   
		//groups.remove("Iron Maiden");
		//groups.remove(0);
		
		for(int i = 0; i< groups.size(); i++ ) {
			
			System.out.println("Eleman:" + groups.get(i));
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
