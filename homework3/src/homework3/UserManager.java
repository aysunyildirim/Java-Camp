package homework3;

public class UserManager {

	 public void add(User user) {
		 System.out.println( user.getFirstName() + " ana sistemden eklendi");
	    }
	    
	   public void delete(User user) {
		   System.out.println(user.getFirstName() +" ana sistemden silindi");
	   }
	   public void update(User user) {
		   System.out.println(user.getLastName() + " ana sistemde guncellendi");
	   }
	   
	
	

	
	
}
