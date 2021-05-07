package homework3;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		student1.setId(1);
		student1.setStudentId(1);
		student1.setFirstName("Berkant");
		student1.setLastName("Gürün");
		student1.setEmail("berkantgurun@gmail.com");
		student1.setPassword("123456789");
		student1.setCourse("Java");
		
		
		Student student3 = new Student();
		
		student3.setId(3);
		student3.setStudentId(3);
		student3.setFirstName("Ayşe");
		student3.setLastName("Tecik");
		student3.setEmail("aysetecik123@windowslive.com");
		student3.setPassword("147258369");
		student3.setCourse("#C");

		
		StudentManager studentManager = new StudentManager();
		
		studentManager.add(student1);
		studentManager.login(student1);
		studentManager.logout(student1);
		
		studentManager.add(student3);
		studentManager.login(student3);
		studentManager.logout(student3);
		
		Instructor instructor1 = new Instructor();
		
		instructor1.setId(1);
		instructor1.setInstructorId(1);
		instructor1.setFirstName("Emre");
		instructor1.setLastName("Yollu");
		instructor1.setEmail("emreyollu@hotmail.com");
		instructor1.setPassword("369258147");
		
		Instructor instructor2 = new Instructor(); 
		
		instructor2.setId(2);
		instructor2.setInstructorId(2);
		instructor2.setFirstName("Emre");
		instructor2.setLastName("Yollu");
		instructor2.setEmail("emreyollu@hotmail.com");
		instructor2.setPassword("369258147");
		
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.add(instructor1);
		instructorManager.login(instructor1);
		instructorManager.logout(instructor1);
		
		instructorManager.add(instructor2);
		instructorManager.login(instructor2);
		instructorManager.logout(instructor2);
		
		
	
		
		
		

	
		
	}

}
