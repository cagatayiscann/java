package websiteProject.dataAccess;

import websiteProject.entities.Course;

public class JdbcCourseDao implements ICourseDao{
	public void add(Course course) {
		System.out.println("Kurs jdbc ile eklendi: " + course.getName());
	}
}
