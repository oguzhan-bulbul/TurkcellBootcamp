package turkcellcamp01;

import java.util.ArrayList;
//mukemmel sayilar
public class Task2 {

	public static boolean mukemmelSayi(int sayi) {
		int top=0;
		for (int i = 1; i < sayi; i++) {
			if(sayi % i == 0) {
				top += i;
			}
		}
		
		if(top == sayi) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int sayac = 1, sayi=1;
		boolean control=false;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(sayac < 6) {
			control = mukemmelSayi(sayi);
			if (control) {
				System.out.println(sayi);
				list.add(sayi);
				sayac++;
			}
			sayi++;
		}		
		System.out.println(list);
	}		

}
