package OOP2Workshop;

public class StudentManager {
	public void add(Student student) {
		System.out.println(student.getFirstName() + " eklendi.");
	}
	public void update(Student student) {
		System.out.println(student.getFirstName() + " guncellendi.");
	}
	public void delete(Student student) {
		System.out.println(student.getFirstName() + " silindi.");
	}

}
