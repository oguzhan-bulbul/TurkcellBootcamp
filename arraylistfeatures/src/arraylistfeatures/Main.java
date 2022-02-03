package arraylistfeatures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;

public class Main {

	public static void main(String[] args) {
		/* ArrayList Sinifi
		 * Java Collections Framework icerisinde yer alir.
		 * java.lang.Object -> java.util.AbstractCollection<E> -> java.util.AbstractList<E> -> java.util.ArrayList<E> classlarindan turetilmistir. 
		 * List<E>,RandomAccess,Iterable<E>,Collection<E>,Cloneable,Serializable interfacelerini implemente eder.
		 * List interface'inin yeniden boyutlandirilabilir bir implementasyonudur.
		 * Tum list operasyonlarini kullanabilir.Icerisinde tum nesneler tutulabilir(null dahil)
		 * Sirali bir koleksiyondur ekleme sirasini korur.
		 * Senkronize bir yapiya sahip degildir.Birden fazla is bloklarini ayni anda degistiremez.
		 * ilkel veri tiplerinden arraylist olusturulamaz.(Orn int degil Integer classini kullanmaliyiz)
		 * List interface i implementasyonu sayesinde diziyi manipule edebilecek methodlara sahip olur.
		 * 
		 * Collection<E> collection interface'i koleksiyon hiyerarsisinin temel interface'idir.
		 * Koleksiyonlar temel olarak nesneler grubunu temsil eder. Bazi koleksiyonlar siralidir bazilari degildir-
		 * veya bazilari icerisinde ayni elementten birden cok barindamaya izin verir bazilari vermez.
		 * JDK bu interfacein direk implementasyonuna izin vermez.Bu interface'in daha spesifik alt implementasyonlarini kullaniriz.Set,List gibi.
		 * 
		 * List<E> bir Collection<E> implementasyonudur. Sirali bir koleksiyondur.Ayni elemanlarin tutulmasina izin verir.

		 * Cloneable interface'ini implemente ettigi icin ArrayList instance'i kopyasi clone() methoduyla olusturabilir.Bu interface bunu yasal hale getirir.
		 * Bu sinifi implemente etmeyen classlardan olusturulan instancelarda bu islem yapilmaya calisilirsa CloneNotSupportedException hatasi alinir.
		 * 
		 * Iterable<T> interface'i bu classa for each dongusuyle uzerinde gezilebilmesi ozelligini kazandirir.
		
		 
		 * RandomAccess bir isaretleme interface'idir.List implementasyonlari tarafindan hizli,rastgele erisimi desteklediklerini belirtmek icin kullanilir.
		 * Bu arabirimin genel amaci algoritmalarin,rastgele veya sirali erisim listelerine -
		 * uygulandiginda iyi performans vermesini saglamak icin davranislarini degistirmesine izin vermektir.
		 * 
		 * Serializable interface'i isaretleme amacli kullanilir.Bu interfacei implemente etmeyen classlarin-
		 * ve nesneleri serialized veya deserialized edilemezler.
		 */ 
		/*
		 * ArrayListler
		 * Veri eklenip silindiginde boyutunu kendisi otomatik olarak ayarlar.
		 * size,isEmpty,get,set,iterator,listIterator  o(1) zaman karmasasinda calisir.
		 * add methodu o(n) zaman karmasasina sahiptir.
		 * Diger methodlar dogrusal zaman karmasasina sahiptir.
		 * Her ArrayList instance'inin bir kapasitesi vardir.
		 * ArrayListe elemanlar eklendikce kapasitesi otomatik olarak artmaktadir.
		 * Her bir eleman eklendigin kapasite tekrardan buyutulmektedir.
		 * Uygulama ArrayList'in boyutunu eleman eklemeden ensureCapacity methodunu kullanarak artirabilir.
		 * Bu islem surekli artan tahsis miktarini azaltabilir.
		 */
		/*
		 * ArrayList instance'ina ayni anda birden cok thread erisirse ve bu threadlerden biri listeyi-
		 * yapisal olarak degistirirse, disaridan senkronize edilmelidir.
		 * Bu islem listeyi dogal olarak kapsayan nesneler uzerinde senkronizasyon yapilarak gerceklestirilir.
		 * Eger boyle bir nesne yoksa liste Collections.synchronizedList methoduyla sarilmalidir.
		 */
		/*
		 * ArrayList classinin iterator ve listIterator methodundan donen iteratorler fail-fast'dir.
		 * Eger liste iterator olusturduktan sonra yapisal olarak degistirilirlerse(iteratorun kendi add ve remove methodlari disinda)
		 * iterator ConcurrentModificationException dondurur.
		 * Iterator gelecekte belirsiz bir zamanda ve deterministik olmayan davranislari riske atmamak icin temiz ve hizli bi sekilde coker.
		 * 
		 * 
		 * 
		*/
		
		/*
		 * ArrayListlerin methodlari asagida incelenecektir.
		 */
		
		
		
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Trabzon");
		cities.add("Ankara");
		cities.add("Istanbul");
		cities.add("Giresun");
		cities.add("Izmir");
		
		System.out.println(cities);
		
		// add methodlari
		// add(E e) listenin sonuna eleman ekleme islemi icin kullanilir. ve islem basarili ise true degilse false dondurur. 
		cities.add("Manisa");
		System.out.println(cities);
		
		//add(int index,E element) Verilen elemani verilen index'e ekler.
		cities.add(2,"Kars");
		System.out.println(cities);
		
		//addAll(Collection<? extends E> c) c koleksiyonunu listenin sonuna ekler.c koleksiyonu E sinifini extend eden nesnelerden olusmus olmasi gerekir.
		
		ArrayList<String> cities2 = new ArrayList<>();
		cities2.add("Erzurum");
		cities2.add("Adana");	
		
		cities.addAll(cities2);		
		System.out.println(cities);
		// addAll(int index,Collection<? extends E> c)  c koleksiyonunu verilen indexten sonra ekler.c koleksiyonu E sinifini extend eden nesnelerden olusmus olmasi gerekir.
		ArrayList<String> cities3 = new ArrayList<>();
		cities3.add("Hatay");
		cities3.add("Bursa");
		
		cities.addAll(2, cities3);
		System.out.println(cities);
		
		//clear() methodu listenin icerisinde elemanlarin tumu siler.
		cities3.clear();
		System.out.println(cities3);
		
		//clone() methodu arrayin yuzeysel bir kopyasini dondurur. bir Object sinifi nesnesi dondurur
		
		Object cities4 = cities2.clone();
		System.out.println(cities4);
		
		// contains(Object o) methodu verilen nesnenin dizi icerisinde olup olmadigini kontrol eder eger varsa true yoksa false dondurur.
		
		System.out.println(cities.contains("Trabzon"));
		System.out.println(cities.contains("Mardin"));
		
		// ensureCapacity(int minCapacity)
		// Arraylistlerde her eleman ekleme isleminde array yeniden boyutlandirilir.
		// her eleman isleminde yeniden boyutlandirmanin onune gecmek istiyorsak
		//bu method ile min beklenen kapasiteyi artirabiliriz. Bu bir performans iyilestirmesi olarak degerlendirilebilir.
		cities.ensureCapacity(15);
		
		// forEach(Consumer <? super  E> action)
		//verilen fonksiyonu liste uzerindeki her elemana uygular.
		//Islem tamamlanana kadar veya bir hata firlatana kadar devam eder.
		
		cities.forEach((n) -> System.out.print(n + " "));
		System.out.println();
		
		//get(int index) verilen indexte bulunan nesneyi dondurur.
		
		System.out.println(cities.get(2));
		
		//indexof(Object o ) verilen nesnenin ilk karsilastigi index bilgisini dondurur.
		//Eger eleman array icerisinde yoksa -1 dondurur.
		
		System.out.println(cities.indexOf("Hatay"));
		
		// lastIndexOf(Object o) verilen nesnenin son karsilasilan index bilgisini dondurur
			System.out.println(cities.lastIndexOf("Adana"));
		
		// isEmpty() eger array'de eleman yoksa true dondurur.
		System.out.println(cities3.isEmpty());
		
		// iterator() array icin bir iterator nesnesi olusturur.
		//iterator nesnesini dizinin uzerinde gezinmek ve islem yapmak icin kullanabiliriz.
		// dizi uzerinde eleman ekleme , guncelleme gibi islemler yapilamaz.
		
		Iterator<String> iterator = cities.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//listIterator() arrayin ListIterator nesnesini dondurur.
		// list iterator list sinifina ait bir nesnedir Set ve Map siniflarinda kullanilamaz.
		//array uzerinde eleman ekleme , ileriye ve geriye gezinme , eleman degistirme methodlari listIteratorda kullanilabilir.
		//nextIndex() , previousIndex() gibi normal iteratorde olmayan methodlari vardir.
		
		ListIterator<String> listIterator = cities.listIterator();
		
		listIterator.next();//ilk elemanin uzerine gelir.
		listIterator.next();//Ikinci elemanin uzerine gelir
		listIterator.set("Yozgat");
		
		System.out.println("---------------------------");
		
		for(String s : cities) {
			System.out.println(s);
		}
		
		//listIterator(int index) verilen indexten baslayarak arrayin sonuna kadar olan kismi icin iterator olusturur.
		//listIterator methodlari gecerlidir.
		ListIterator<String> listIterator2 = cities.listIterator(2);
		listIterator2.next(); // iteratorumuz ilk elemani cities arrayinin 2.indexi olur.
		listIterator2.set("Bolu");
		System.out.println("---------------------------");
		for(String s : cities) {
			System.out.println(s);
		}
		//remove(int index) methodu verilen indexteki elemani siler;
		
		cities.remove(2);
		System.out.println(cities);
		
		//remove(Object o) verilen nesneyi arrayden siler
		//Eger dizide ayni nesneden birden fazla var ise karsilastigi ilk nesneyi siler.
		
		cities.remove("Yozgat");
		System.out.println(cities);
		
		//removeAll(Collection<?> c) verilen koleksiyondaki elementleri arrayden siler.
		
		cities.removeAll(cities2);
		System.out.println(cities);
		//removeIf(Predicate<? super E> filter)
		//Parametre olarak verilen filtreye uyan elemanlari listeden siler
		cities.removeIf(n -> n.startsWith("T"));
		//removeRange(int fromIndex , int toIndex) verilen baslangic ve bitis indexi arasindaki elemanlari siler.
		//Bu fonksiyonun access modifier'i protected oldugu icin,
		//Bu fonksiyon sadece ArrayList sinifini extend eden classlardan olusturulan nesnelerde kullanilabilir.
		
		//replaceAll(UnaryOperator<E> operator)
		//Verilen fonksiyonu liste uzerine uygular ve degerleri cikan sonucla degistirir.
		cities.replaceAll(e -> e.toUpperCase());
		System.out.println(cities);
		
		//retainAll(Collection<?> c)
		// Bu method parametre olarak verilen koleksiyondaki nesneler disindaki tum nesneleri
		// arrayden silmek icin kullanilir
		cities3.add("TRABZON");
		cities3.add("ISTANBUL");
		cities3.add("GIRESUN");
		cities3.add("IZMIR");
		
		cities.retainAll(cities3);
		System.out.println(cities);
		
		//set(int index, E e) verilen nesneyi verilen indexteki degerle degistirir.
		
		cities.set(2, "MANISA");
		System.out.println(cities);
		
		//size() arraydeki eleman sayisini dondurur.
		
		System.out.println(cities.size());
		
		//sort(Comparator<? super E> c) verilen comparator nesnesine gore elemanlari siralar.
		
		cities.sort(Comparator.naturalOrder());
		System.out.println(cities);
		
		//spliterator() arraydeki elemanlar uzerinde late-binding ve fail-fast bir spliterator nesnesi olusturur.
		//split + iterator nesnesi
		//tryAdvance(),forEachRemaining(),trySplit() methodlari bulunur.
		//Daha cok birden cok is parcacigiyla calisilan es zamanli, paralel islem yapan uygulamalarda kullanilir.
		Spliterator<String> spliterator = cities.spliterator();
		
		spliterator.forEachRemaining(s -> System.out.println(s));
		
		System.out.println("--------------------");
		Spliterator<String> spliterator2 = cities.spliterator();
		spliterator2.tryAdvance(s -> System.out.println(s));//iterator gibi bir sonraki nesneyi ekrana yazdirir
		spliterator2.tryAdvance(s -> System.out.println(s));
		spliterator2.tryAdvance(s -> System.out.println(s));
		
		System.out.println("--------------------");
		// spliterator3 2 parcaya bolunur ve yarisi spliterator4 e atanir.Es zamanli calisan uygulamalarda performansi artirir. 
		Spliterator<String> spliterator3 = cities.spliterator();
		Spliterator<String> spliterator4 = spliterator3.trySplit();
		
		
		//subList(int fromIndex,int toIndex) verilen baslangic indexinden bitis indexine kadar olan nesneleri List halinde dondurur.
		
		System.out.println(cities.subList(1, 3));
		System.out.println("-------------");
		
		//toArray() arrayListdeki tum elemanlari Object sinifindan dizi olarak dondurur.
		
		Object[] array = cities.toArray();
		
		//toArray(T[] a) verilen dizideki nesneleri bir dizi olarak dondurur.
		
		String[] array2 = cities.toArray(new String[cities.size()]);
		for(String s : array2) {
			System.out.println(s);
		}
		
		//trimToSize() eger bir arraylistin boyutu fazla belirtilmis ve icerisi tam olarak doldurulmamissa-
		//bu method kullanilarak kullanilmayan bosluklar cikarilir.
		
		ArrayList<Integer> arr = new ArrayList<Integer>(15);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		arr.trimToSize();
		for(Integer i : arr) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
