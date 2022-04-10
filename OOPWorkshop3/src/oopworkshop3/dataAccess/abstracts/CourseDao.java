package oopworkshop3.dataAccess.abstracts;

import oopworkshop3.entities.concretes.Course;

public interface CourseDao {
	void add(Course course);
	void update(Course course);
	void delete(Course course);
	

}
