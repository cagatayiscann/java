package oopWithNLayeredApp.business;


import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.dataAccess.jdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		//iş kuralları
		if(product.getUnitPrice()<10) {
			throw new Exception("ürün fiyatı 10'dan küçük olamaz");
		};
		
		//ProductDao productDao = new jdbcProductDao();
		productDao.add(product);
		
		for (Logger logger : loggers) { //[db, mail]
			logger.log(product.getName());
		}
	}

}
