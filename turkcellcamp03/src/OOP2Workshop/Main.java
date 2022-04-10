package OOP2Workshop;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Java", "Java ile Yazilima Baslangic", 1500, "java.png");
		Course course2 = new Course(2, "Python", "Python ile Yazilima Baslangic", 2500, "python.png");
		Course course3 = new Course(3, "JavaScript", "Javascript ile Yazilima Baslangic", 3500, "javascript.png");
		
		Category category1 = new Category(1, "Yazilim");
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demirog", "engin@mail.com", 15, "engin.png");
		Instructor instructor2 = new Instructor(2, "Oguzhan", "Bulbul", "ouz@mail.com", 15, "ouz.png");
		Instructor instructor3 = new Instructor(3, "Hakan", "Bulbul", "hakan@mail.com", 15, "hakan.png");
		
		
		Student student1 = new Student(1, "Neslihan", "Bulbul", "neslihan@mail.com", "KTU");
		Student student2 = new Student(1, "Yusuf", "Camur", "yusuf@mail.com", "ITU");
		Student student3 = new Student(1, "Yunus", "Demir", "yunus@mail.com", "ODTU");
		//------------------------------------------------------------------------------------------------------
		
		category1.setCourses(new Course[] {course1,course2,course3});
		
		course1.setCategory(category1);
		course1.setStudents(new Student[] {student1,student2});
		course1.setInstructors(new Instructor[] {instructor1,instructor3});
		
		course2.setCategory(category1);
		course2.setStudents(new Student[] {student2,student3});
		course2.setInstructors(new Instructor[] {instructor1,instructor2});
		
		course3.setCategory(category1);
		course3.setStudents(new Student[] {student1,student2,student3});
		course3.setInstructors(new Instructor[] {instructor2,instructor3});
		
		instructor1.setCourses(new Course[] {course1,course2});
		instructor2.setCourses(new Course[] {course2,course3});
		instructor3.setCourses(new Course[] {course1,course3});
		
		student1.setCourses(new Course[] {course1,course3});
		student2.setCourses(new Course[] {course1,course2,course3});
		student3.setCourses(new Course[] {course2,course3});
		
		
		
		
	}

}
