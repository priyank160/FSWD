package in.ac.charusat.studentmgmtsystem.controller;

import in.ac.charusat.studentmgmtsystem.model.Result;
import in.ac.charusat.studentmgmtsystem.model.Student;
import in.ac.charusat.studentmgmtsystem.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResultController {
    @Autowired
    ResultRepository resultRepository;
    @GetMapping("/listResult")
    public List<Result> getAllStudents() {
        return resultRepository.findAll();
    }

    @GetMapping("/student/{id}")
    public Result getStudent(@PathVariable Integer id) {
        return resultRepository.findById(id).get();
    }


    @DeleteMapping("/deleteResult/{id}")
    public List<Result> deleteStudent(@PathVariable Integer id) {
        resultRepository.delete(resultRepository.findById(id).get());
        return resultRepository.findAll();
    }

    // Update the student information
    @PutMapping("/updateResult/{id}")
    public List<Result> updateStudent(@RequestBody Result result, @PathVariable Integer id) {
        Result studentObj = resultRepository.findById(id).get();
        studentObj.setId(result.getId());
        studentObj.setCourseId(result.getCourseId());
        studentObj.setMarks(result.getMarks());
        resultRepository.save(studentObj);
        return resultRepository.findAll();
    }


    @PostMapping("/student/resultAdd")
    public List<Result> addStudent(@RequestBody Result result) {
        resultRepository.save(result);
        return resultRepository.findAll();
    }

}
