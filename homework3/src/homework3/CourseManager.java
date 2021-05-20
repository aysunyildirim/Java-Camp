package homework3;

public class CourseManager {
	public void add(Course course) {
		System.out.println("Course eklendi: " + course.getCourseName());
	}

	public void delete(Course course) {
		System.out.println("Course silindi: " + course.getCourseName());
	}

	public void update(Course course) {
		System.out.println("Course guncellendi: " + course.getCourseName());
	}

	public void givenCourse(Course course, Instructor instructor) {
		System.out.println(
				course.getCourseName() + " isimli ders " + instructor.getFirstName() + " tarafından verilecek");
	}

	public void takenCourse(Course course, Student student) {
		System.out.println(course.getCourseName() + " isimli ders " + student.getFirstName() + " tarafından alındı");
	}
}
