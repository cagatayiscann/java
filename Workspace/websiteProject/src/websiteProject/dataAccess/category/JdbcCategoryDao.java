package websiteProject.dataAccess.category;

import websiteProject.entities.Category;

public class JdbcCategoryDao implements ICategoryDao{

	public void add(Category category) {
		System.out.println("category added with Jdbc: " + category.getName());
		
	}
}
