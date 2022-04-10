package oopworkshop3;

import oopworkshop3.business.concretes.CourseManager;
import oopworkshop3.dataAccess.concretes.hibernateImpls.hibernateCourseDao;
import oopworkshop3.dataAccess.concretes.jdbcImpls.jdbcCourseDao;
import oopworkshop3.entities.concretes.Course;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Java", 1500);
		CourseManager courseManager1 = new CourseManager(new hibernateCourseDao());
		CourseManager courseManager2 = new CourseManager(new jdbcCourseDao());
		
		courseManager1.add(course1);
		courseManager2.add(course1);

	}

}
