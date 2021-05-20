package homework3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(1);
		user.setFirstName("Engin");
		user.setLastName("Demirog");
		user.setPassword("12345");
		user.setEmail("engindemirog@gmail.com");
		
		
		Student student = new Student(1,"Ali","Yılmaz","aliyilmaz@gmail.com","3456","18110032019");
		
		Instructor instructor = new Instructor(2,"Sibel","Zehra","sibelzehra@gmail.com","5678","9999","6756565");
		
		Course course = new Course(7,"Java");
		
		StudentManager  studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.delete(student);
		studentManager.studentInformation(student);
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course);
		courseManager.delete(course);
		courseManager.update(course);
		courseManager.givenCourse(course, instructor);
		courseManager.takenCourse(course, student);
		
		
		
				
				
	}

}
