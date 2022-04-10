package OOP2Workshop;

public class Course {
	private int id;
	private String name;
	private String description;
	private int price;
	private String imagePath;
	private Category category;
	private Instructor[] instructors;
	private Student[] students;
	public Course() {
		
	}
	public Course(int id, String name, String description, int price, String imagePath) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imagePath = imagePath;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Instructor[] getInstructors() {
		return instructors;
	}
	public void setInstructors(Instructor[] instructors) {
		this.instructors = instructors;
	}
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	
	
	
	
	
	
	
	

}
