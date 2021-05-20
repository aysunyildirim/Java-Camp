package homework3;

public class StudentManager extends User {

	public void add(User user) {
		System.out.println(user.getFirstName() + " kaydedildi");
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " silindi");
	}

	public void update(User user) {
		System.out.println(user.getLastName() + " guncellendi");
	}

	public void studentInformation(Student student) {
		System.out.println("Ogrenci bilgileri");
		System.out.println("Ýsim: " + student.getFirstName() + "\nSoyisim: " + student.getLastName() + "\nEmail: "
				+ student.getEmail());
	}

}
