package nLayeredApp.business.concretes;

import nLayeredApp.business.abstracts.ProductService;
import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductManager implements ProductService{
	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}
	@Override
	public void add(Product product) {
		// Is kurali kodlari
		//urun ismi tekrar edemez
		//urun fiayti 0'dan kucuk olamaz
		//is kurallarindan gecerse db islemi yapabiliriz artik
		
		/*JdbcProductDao jdbcProductDao = new JdbcProductDao();
		jdbcProductDao.add(product);*/
		this.productDao.add(product);
		
		
	}
	@Override
	public void update(Product product) {
		// Is kurali kodlari
		//urun ismi tekrar edemez
		//urun fiayti 0'dan kucuk olamaz
		//is kurallarindan gecerse db islemi yapabiliriz artik
		this.productDao.update(product);
	
		
	}
	@Override
	public void delete(Product product) {
		// Is kurali kodlari
		//urun ismi tekrar edemez
		//urun fiayti 0'dan kucuk olamaz
		//is kurallarindan gecerse db islemi yapabiliriz artik
		this.productDao.delete(product);
	
		
	}

}
