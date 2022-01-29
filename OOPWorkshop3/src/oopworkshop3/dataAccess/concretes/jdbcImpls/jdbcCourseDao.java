package oopworkshop3.dataAccess.concretes.jdbcImpls;

import oopworkshop3.dataAccess.abstracts.CourseDao;
import oopworkshop3.entities.concretes.Course;

public class jdbcCourseDao implements CourseDao{

	public void add(Course course) {
		System.out.println("jdbc nesne eklendi" + course.getName());
		
	}

	public void update(Course course) {
		System.out.println("jdbc nesne eklendi" + course.getName());
		
	}

	public void delete(Course course) {
		System.out.println("jdbc nesne eklendi" + course.getName());
		
	}

}
