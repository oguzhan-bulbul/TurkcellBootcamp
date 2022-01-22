package OOP2Workshop;

public class Instructor extends User{
	private int salary;
	private String imagePath;
	private Course[] courses;
	public Instructor() {
		
	}
	public Instructor(int id, String firstName, String lastName, String email,int salary, String imagePath) {
		super(id,firstName,lastName,email);
		this.salary = salary;
		this.imagePath = imagePath;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	
	
	
	
	
	

}
