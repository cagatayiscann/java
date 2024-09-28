package websiteProject.business;

import java.util.HashSet;
import java.util.Set;

import websiteProject.core.logging.Logger;
import websiteProject.dataAccess.category.ICategoryDao;
import websiteProject.entities.Category;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private Set<String> categories;
	private Logger[] loggers;
	
	public CategoryManager(ICategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = new HashSet<String>();
	}
	
	public void add(Category category) throws Exception {
		if(categories.contains(category.getName())) {
			throw new Exception("This category already exists:" + category.getName());
		}
		categoryDao.add(category);
		categories.add(category.getName());
		
		for(Logger logger: loggers) {
			logger.log(category.getName());
		}
	}

}
