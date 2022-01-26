package oop3;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("Hibernate kullaranak eklendi" + product.getName());
		
	}

	@Override
	public void update(Product product) {
		System.out.println("Hibernate kullaranak guncellendi" + product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("Hibernate kullaranak silindi" + product.getName());
		
	}

}
