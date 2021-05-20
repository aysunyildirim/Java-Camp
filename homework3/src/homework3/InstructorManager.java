package homework3;



public class InstructorManager extends UserManager{

	    
  public void update1(Instructor instructor) {
	  System.out.println(instructor.getFirstName() + " eklendi");
	  
  }
  public void update11(Instructor instructor) {
	  System.out.println(instructor.getEmail() + " guncellendi");
  }
  public void update(Instructor instructor) {
	  System.out.println(instructor.getPassword() + " parolayý yaz");
  }
	
	
	
}
