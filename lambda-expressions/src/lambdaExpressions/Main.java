package lambdaExpressions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

/*
 * Lambda expression java 8 ile birlikte gelen ozelliklerdendir.
 * Lambda expression bize kisa ve oz bir sekilde metot tanimlama kolayligini saglar.
 * Koleksiyon siniflari uzerinde cok kullanislidir.
 * Koleksiyonlar uzerinde iterasyon,filtreleme,veri cekmemizi kolaylastirir.
 * Lambda expressionlar Functional interfaceleri implemente etmek icin kullanilirlar
 * Functional interface tek bir abstract methodu olan interfacelere denir
 * Hic bir classa ait olmaya metotlar olusturur.
 * lambda expressionlar az kodla cok is yapilmasini saglar
 * lambda expressions icerisine parametre alip bir deger donduren kisa kod bloklaridir.
 * EGer kod blogu birden fazla ifadeden olusuyorsa curly brackets (suslu parantez) kullanilir.
 * EGer parametre blogu birden fazla ifadeden olusuyorsa parantez kullanilir
 */

public class Main {

	public static void main(String[] args) {
		
		//lambda ifadeleri ile Functional bir interface implementasyonu
		// Bunun icin tek metotu olan FuncInterface isimli bir interface ayni pakette yazilmistir.
		
		FuncInterface multiply = (int a, int b) -> a*b;
		FuncInterface addition = (int a,int b) -> a+b;
		
		System.out.println(multiply.operation(5, 10));
		System.out.println(addition.operation(5, 10));
		
		//Kolekiyonlar uzerinde hizli ve az kod ile filtreme veya veri cekme islemleri yapilabilir
		
		//Ornek bir ArrayList olusturalim
		
		ArrayList<String> name = new ArrayList<>();
		name.add("Oguzhan");
		name.add("Osman");
		name.add("Hakan");
		name.add("Neslihan");
		name.add("Alp");
		
		name.forEach(n -> { if(n.startsWith("O")) System.out.println(n);});
		name.forEach(n -> { if(n.length()<4) System.out.println(n);});
		
		
		
		
		
		

	}

}
