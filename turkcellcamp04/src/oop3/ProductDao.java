package oop3;

//DAO - Data Access Object / DAL - Data Access Layer
//Contract. The class which implemented this interface must define all methods in interface.

public interface ProductDao {
	void add(Product product);	
	void update(Product product);	
	void delete(Product product);
	

	
	
}
