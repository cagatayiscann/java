package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.jdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "iphone x", 10000);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		
		
		ProductManager productManager = new ProductManager(new jdbcProductDao(), loggers);
		productManager.add(product1);

	}

}
