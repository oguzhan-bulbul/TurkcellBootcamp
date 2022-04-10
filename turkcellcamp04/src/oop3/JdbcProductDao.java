package oop3;
//implementor class
public class JdbcProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("JDBC kullanarak eklendi. " + product.getName());
		
	}

	@Override
	public void update(Product product) {
		System.out.println("JDBC kullanarak guncellendi. " + product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("JDBC kullanarak silindi. " + product.getName());
		
	}

}
