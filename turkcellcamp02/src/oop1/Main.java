package oop1;

public class Main {

	public static void main(String[] args) {
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Telefon");
		String name = "Engin";
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Iphone 12");
		product1.setUnitPrice(12000);
		product1.setDiscount(1500);
		product1.setImages( new String[] {"asd","sd","as"});
		product1.setCategory(category1);

		
		System.out.println(product1.getDiscountedPrice());
		

		Product product2 = new Product(1,"Iphone 13",12225,1000, new String[] {"asd","sd","as"});
		product2.setCategory(category1);

		
		System.out.println(product2.getDiscountedPrice());
		
		Product product3 = new Product();
		product3.setId(1);
		product3.setName("Iphone 14");
		product3.setUnitPrice(12000);
		product3.setDiscount(1500);
		product3.setImages( new String[] {"asd","sd","as"});
		product3.setCategory(category1);

		
		System.out.println(product1.getDiscountedPrice());
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
			System.out.println(product.getUnitPrice());
			System.out.println(product.getDiscount());
			System.out.println(product.getDiscountedPrice());
			System.out.println(product.getCategory().getName());
			System.out.println("---------------------");
		}
		

	}

}
