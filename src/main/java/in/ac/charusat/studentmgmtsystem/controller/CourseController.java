package in.ac.charusat.studentmgmtsystem.controller;

import in.ac.charusat.studentmgmtsystem.model.Course;
import in.ac.charusat.studentmgmtsystem.model.Result;
import in.ac.charusat.studentmgmtsystem.repository.CourseRepository;
import in.ac.charusat.studentmgmtsystem.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CourseController {
    @Autowired
    CourseRepository courseRepository;
    @GetMapping("/listCourse")
    public List<Course> getAllStudents() {
        return courseRepository.findAll();
    }

    @GetMapping("/studentCourse/{id}")
    public Course getStudent(@PathVariable Integer id) {
        return courseRepository.findById(id).get();
    }


    @DeleteMapping("/deleteCourse/{id}")
    public List<Course> deleteStudent(@PathVariable Integer id) {
        courseRepository.delete(courseRepository.findById(id).get());
        return courseRepository.findAll();
    }

    @PutMapping("/updateCourse/{id}")
    public List<Course> updateStudent(@RequestBody Course course, @PathVariable Integer id) {
        Course studentObj = courseRepository.findById(id).get();
        studentObj.setId(course.getId());
        studentObj.setCourseId(course.getCourseId());
        studentObj.setCourseName(course.getCourseName());
        courseRepository.save(studentObj);
        return courseRepository.findAll();
    }


}
