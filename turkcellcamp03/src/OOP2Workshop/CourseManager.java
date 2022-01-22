package OOP2Workshop;

public class CourseManager {
	private Course[] courses;
	public void addStudent(Student student) {
		System.out.println(student.getFirstName()+" isimli ogrenci kursa kayit oldu");
	}
	public Course[] getCourseList() {
		System.out.println("Kurs Listesi");
		return courses;
	}
	

}
