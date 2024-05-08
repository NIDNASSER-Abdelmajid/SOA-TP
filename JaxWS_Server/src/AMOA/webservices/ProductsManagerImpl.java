package AMOA.webservices;

import java.util.ArrayList;
import javax.jws.WebService;

import AMOA.domain.Product;
import AMOA.domain.Products;
import AMOA.exceptions.NoSuchProductException;

@WebService(endpointInterface = "AMOA.webservices.ProductsManager")
public class ProductsManagerImpl implements ProductsManager{
	
	private static Products products = new Products(new ArrayList<>());
	
	public long addProduct(Product product) {
		return 0;}
		
	@Override
	public Product getProduct(long id) throws NoSuchProductException {
		Product product = products.get(id);
		
		if (product != null) {
			return product;
		} else {
			throw new NoSuchProductException("No such product!");
		}
	}
	
	public double getProductPrice(long id) throws NoSuchProductException{
		return id;}
	
	public Products getProduct() {
		return null;}
	
	public Product updateProduct(Product product) {
		return product;}
	
	public boolean deleteProduct(long id) {
		return false;}
	
	public boolean deleteAllProduct() {
		return false;}

	@Override
	public Products getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteAllProducts() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
