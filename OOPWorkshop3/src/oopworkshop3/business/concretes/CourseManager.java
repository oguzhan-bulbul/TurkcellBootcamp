package oopworkshop3.business.concretes;

import oopworkshop3.business.abstracts.CourseService;
import oopworkshop3.dataAccess.abstracts.CourseDao;
import oopworkshop3.entities.concretes.Course;

public class CourseManager implements CourseService{
	private CourseDao courseDao;
	
		
	public CourseManager(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	@Override
	public void add(Course course) {
		this.courseDao.add(course);
		
	}

	@Override
	public void update(Course course) {
		this.courseDao.update(course);
		
	}

	@Override
	public void delete(Course course) {
		this.courseDao.delete(course);
		
	}

}
