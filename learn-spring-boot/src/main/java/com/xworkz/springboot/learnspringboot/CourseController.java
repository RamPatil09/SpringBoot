package com.xworkz.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Courses> retrieveAllCourses() {
		return Arrays.asList(new Courses(1, "Learn Spring Boot", "X-workz"),
				new Courses(2, "Learn DevOps", "X-workz"),
				new Courses(3, "Learn AWS", "X-workz"),
				new Courses(4, "Learn Node JS", "X-workz"));
	}
}
