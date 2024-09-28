package websiteProject.dataAccess.instructor;

public class JdbcInstructorDao implements IInstructorDao{

	@Override
	public void add(String data) {
		System.out.println("Instructor created with Jdbc: " + data);
		
	}

}
