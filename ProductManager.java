public class ProductManager implements ProductServices {

	@Override
	public void add(Product product) {
		System.out.println("Ürün eklendi: " + product.gameName);		
	}

	@Override
	public void delete(Product product) {
		System.out.println("Ürün silindi: " + product.gameName);		

	}
	
	@Override
	public void configuration(Product product) {
		System.out.println("Ürün bilgileri düzenlendi: " + product.gameName);		

	}

}
