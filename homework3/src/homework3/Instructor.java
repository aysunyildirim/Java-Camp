package homework3;

public class Instructor extends User{
	
	private String certificate;
    private String instructorNumber;
    
    
   
        
    public Instructor() {
    	
    }
    
    public Instructor(int id, String firstName, String lastName, String email, String password, String certificate,
			String instructorNumber) {
		super(id, firstName, lastName, email, password);
		this.certificate = certificate;
		this.instructorNumber = instructorNumber;
	}

	public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(String instructorNumber) {
        this.instructorNumber = instructorNumber;
    }
	
	
	
	
	
	
}
