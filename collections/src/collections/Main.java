package collections;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		String[] cities = new String[] {"Adana"};
		
		cities[0] = " Ankara ";
		
		System.out.println(cities[0]);
		
		ArrayList<String> cities2 = new ArrayList<String>();
		cities2.add("Adana");
		cities2.add("Ankara");
		cities2.remove("Adana");
		System.out.println(cities2.size());
		
	}

}
