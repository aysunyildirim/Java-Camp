package homework3;

public class Student extends User{
	  private String studentNumber;

	public Student(int id, String firstName, String lastName, String email, String password, String studentNumber) {
		super(id, firstName, lastName, email, password);
		this.studentNumber = studentNumber;
	}
	public Student() {
		
	}
	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	 
	     

	    
	
	

	 	
	 	

		
		
		
	
	
	
	
}
