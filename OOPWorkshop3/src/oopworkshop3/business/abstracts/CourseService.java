package oopworkshop3.business.abstracts;

import oopworkshop3.entities.concretes.Course;

public interface CourseService {
	void add(Course course);
	void update(Course course);
	void delete(Course course);
}
