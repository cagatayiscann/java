package websiteProject.business;

import java.util.HashSet;
import java.util.Set;

import websiteProject.core.logging.Logger;
import websiteProject.dataAccess.ICourseDao;
import websiteProject.entities.Course;

public class CourseManager {
	private ICourseDao courseDao;
	private Logger[] loggers;
	private Set<String> courseNames;

	public CourseManager(ICourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courseNames = new HashSet<>();
		
	}
	
	public void add(Course course) throws Exception{
		if(course.getPrice()<0) {
			throw new Exception("Course price cannot be lower than 0");
		}
		
		if(courseNames.contains(course.getName())) {
			throw new Exception("Course with the same name already exists: "+ course.getName());
		}
		
		courseDao.add(course);
		courseNames.add(course.getName());
		
		for(Logger logger: loggers) {
			logger.log(course.getName());
		}
	}
	

}
