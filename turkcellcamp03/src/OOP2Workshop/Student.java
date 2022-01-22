package OOP2Workshop;

public class Student extends User{
	private String collegeName;
	private Course[] courses;
	public Student() {

	}
	public Student(int id, String firstName, String lastName, String email,String collegeName) {
		super(id,firstName,lastName,email);
		this.collegeName = collegeName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	
	
	
	
	
}
