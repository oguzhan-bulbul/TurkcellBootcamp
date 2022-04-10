package oopworkshop3.dataAccess.concretes.hibernateImpls;

import oopworkshop3.dataAccess.abstracts.CourseDao;
import oopworkshop3.entities.concretes.Course;

public class hibernateCourseDao implements CourseDao{

	public void add(Course course) {
		System.out.println("Hibernate nesne eklendi" + course.getName());
		
	}

	public void update(Course course) {
		System.out.println("Hibernate nesne eklendi" + course.getName());
		
	}

	public void delete(Course course) {
		System.out.println("Hibernate nesne eklendi" + course.getName());
		
	}

}
