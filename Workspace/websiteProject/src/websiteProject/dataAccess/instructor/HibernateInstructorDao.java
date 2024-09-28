package websiteProject.dataAccess.instructor;

public class HibernateInstructorDao implements IInstructorDao {

	@Override
	public void add(String data) {
		System.out.println("instructor created with Hibernate: " + data);
		
	}

}
