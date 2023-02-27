package com.bk.spring.proto.bkprotobuf.repo;

import java.util.Map;

import com.bk.spring.proto.bkprotobuf.models.Course;

public class CourseRepository {
    Map<Integer, Course> courses;
    
    public CourseRepository (Map<Integer, Course> courses) {
        this.courses = courses;
    }
    
    public Course getCourse(int id) {
        return courses.get(id);
    }
}
