package websiteProject.dataAccess.category;

import websiteProject.entities.Category;

public class HibernateCategoryDao implements ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("category added with hibernate: " + category.getName());
		
	}
	
}
