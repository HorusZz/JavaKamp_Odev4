public class ProductManager implements ProductServices {

	@Override
	public void add(Product product) {
		System.out.println("�r�n eklendi: " + product.gameName);		
	}

	@Override
	public void delete(Product product) {
		System.out.println("�r�n silindi: " + product.gameName);		

	}
	
	@Override
	public void configuration(Product product) {
		System.out.println("�r�n bilgileri d�zenlendi: " + product.gameName);		

	}

}
