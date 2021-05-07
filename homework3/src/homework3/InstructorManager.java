package homework3;

public class InstructorManager extends Instructor{
	
	public void addCoursevideos(Instructor instructor) {
		
		System.out.println("video added successfully");
	}
	
	public void addHomerwork(Instructor instructor) {
		
		System.out.println("homework successfully added");

	}
	
	public void add(Instructor instructor) {
		
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" "+"trainer added");
		
		
	}
	
	public void login(Instructor instructor) {
		
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" "+"the trainer has logged into the system");
		
	}
	
	public void logout(Instructor instructor) {
		
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" "+"the trainer has logged out of the system.");
	}
	

}
