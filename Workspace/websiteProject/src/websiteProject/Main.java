package websiteProject;

import java.util.HashSet;
import java.util.Set;

import websiteProject.business.CategoryManager;
import websiteProject.business.CourseManager;
import websiteProject.business.InstructorManager;
import websiteProject.core.logging.DatabaseLogger;
import websiteProject.core.logging.FileLogger;
import websiteProject.dataAccess.HibernateCourseDao;
import websiteProject.dataAccess.JdbcCourseDao;
import websiteProject.dataAccess.category.HibernateCategoryDao;
import websiteProject.dataAccess.instructor.HibernateInstructorDao;
import websiteProject.entities.Category;
import websiteProject.entities.Course;
import websiteProject.entities.Instructor;
import websiteProject.core.logging.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		
		Course course1 = new Course("Math", 2000);
		//Course course2 = new Course("Math", 2500);
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course1);
		//courseManager.add(course2);
		
		Category category1 = new Category("Science");
		Category category2 = new Category("Science");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		//categoryManager.add(category2);

		Instructor instructor1 = new Instructor("Cagatay");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor1);
	}
}
