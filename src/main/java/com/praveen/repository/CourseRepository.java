package com.praveen.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.praveen.entity.Course;

@Repository
public class CourseRepository {

	@Autowired
	private EntityManager entityManager;
	
	//findById
	public Course findById(Long id) 
	{
		return entityManager.find(Course.class, id);
	}
	
	//save -> insert or update
	public Course save(Course course)
	{
		return entityManager.merge(course);
	}
	
	//deleteById
	public void deleteById(Long id)
	{
		Course course = findById(id);
		entityManager.remove(course);
	}
}
