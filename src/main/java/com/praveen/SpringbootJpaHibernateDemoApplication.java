package com.praveen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.praveen.entity.Course;
import com.praveen.repository.CourseRepository;

@SpringBootApplication
public class SpringbootJpaHibernateDemoApplication implements CommandLineRunner {

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CourseRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaHibernateDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course course = repo.findById(1L);
		logger.info("Course ID:{} -> {}", course.getId(), course);
	}

}
