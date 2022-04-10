package oop3;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "telefon", 1500, 500, new String[] {});
		
		
		//ProductManager productManager = new ProductManager(new JdbcProductDao());
		ProductManager productManager = new ProductManager(new HibernateProductDao());
		
		productManager.add(product);

	}

}
