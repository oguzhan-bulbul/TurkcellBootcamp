package oop3;

public class ProductManager {
	private ProductDao productDao;
		
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}
	public void add(Product product) {
		// Is kurali kodlari
		//urun ismi tekrar edemez
		//urun fiayti 0'dan kucuk olamaz
		//is kurallarindan gecerse db islemi yapabiliriz artik
		
		/*JdbcProductDao jdbcProductDao = new JdbcProductDao();
		jdbcProductDao.add(product);*/
		this.productDao.add(product);
		
		
	}
	public void update(Product product) {
		// Is kurali kodlari
		//urun ismi tekrar edemez
		//urun fiayti 0'dan kucuk olamaz
		//is kurallarindan gecerse db islemi yapabiliriz artik
		this.productDao.update(product);
	
		
	}
	public void delete(Product product) {
		// Is kurali kodlari
		//urun ismi tekrar edemez
		//urun fiayti 0'dan kucuk olamaz
		//is kurallarindan gecerse db islemi yapabiliriz artik
		this.productDao.delete(product);
	
		
	}
}
