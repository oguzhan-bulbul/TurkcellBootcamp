package OOP2Workshop;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " eklendi.");
	}
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " guncellendi.");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " silindi.");
	}

}
