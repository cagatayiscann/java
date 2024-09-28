package websiteProject.dataAccess;

import websiteProject.entities.Course;

public class HibernateCourseDao implements ICourseDao {
	public void add(Course course) {
		System.out.println("Kurs hibernate ile eklendi: " + course.getName());
	}
}
