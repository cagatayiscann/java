package websiteProject.business;


import websiteProject.core.logging.Logger;
import websiteProject.dataAccess.instructor.IInstructorDao;
import websiteProject.entities.Instructor;

public class InstructorManager {
	IInstructorDao instructorDao;
	Logger[] loggers;
	
	public InstructorManager(IInstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor.getName());
	
	
		for(Logger logger: loggers) {
			logger.log(instructor.getName());
		}
	}
	
	

}
