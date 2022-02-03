
public class ProductManager {
	public void add(String name) throws BusinessException {
		//kodlar
		//kontroller
		if(name=="Elma") {
			throw new BusinessException("Gecersiz urun adi");
		}
	}

}
