
public class Main {

	public static void main(String[] args) {
		
		//Succesfull
		try {
			//Veritabani baglantisi acildi.
			String[] cities = {"Ankara","Istanbul","Izmir"};
			
			cities[3] = "Bursa"; 
			
			System.out.println(cities[2]);
			
		}
		//unsuccessfull
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			//Log
			System.out.println(e.getMessage());
		}
		//resource safety
		finally {
			
		}
		
		ProductManager productManager = new ProductManager();
		try {
			productManager.add("Elma");
		} catch (BusinessException e) {
			
			System.out.println(e.getMessage());
		}
		
		

	}

}
