package com.example.schoolapi.controller;

import model.Groups;
import model.Students;
import com.example.schoolapi.repository.StudentRepositoryImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController {
    @GetMapping("/groups")
    public List<Groups> getGroups(){
        return null;
    }
    @GetMapping("/students")
    public List<Students> getstudent(){
        StudentRepositoryImpl result = StudentRepositoryImpl.getInstance();
        return result.findAll();
    }
    @GetMapping("/students/{name}")
    public @ResponseBody List<Students> getStudentsWhere(@PathVariable (required = true) String name){
        StudentRepositoryImpl result = StudentRepositoryImpl.getInstance();
        return result.findWhereNameLike(name);
    }
    @PostMapping("/students")
    public @ResponseBody Students saveStudent(@RequestBody (required = true) String name){
        StudentRepositoryImpl result = StudentRepositoryImpl.getInstance();
        return  result.save(name);
    }
    @DeleteMapping("/students/{id}")
    public @ResponseBody String deleteStudent(@PathVariable (required = true) Long id){
        StudentRepositoryImpl result = StudentRepositoryImpl.getInstance();
        return result.deleteById(id);
    }
}
