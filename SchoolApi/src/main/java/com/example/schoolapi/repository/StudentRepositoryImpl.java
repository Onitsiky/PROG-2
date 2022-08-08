package com.example.schoolapi.repository;

import com.example.schoolapi.repository.JDBC.Delete;
import com.example.schoolapi.repository.JDBC.Save;
import com.example.schoolapi.repository.JDBC.SelectbyName;
import model.Students;
import com.example.schoolapi.repository.JDBC.SelectAll;

import java.util.List;

public class StudentRepositoryImpl implements Studentrepository{
    @Override
    public List<Students> findAll() {
        List<Students> res = SelectAll.getAllStudents();
        return res;
    }

    @Override
    public Students save(String s) {
        Students result = Save.addStudent(s);
        return result;
    }

    @Override
    public String deleteById(Long id) {
        String result = Delete.deleteById(id);
        return result;
    }

    @Override
    public Students updateNameById(Long id, String newName) {
        return null;
    }

    @Override
    public List<Students> findWhereNameLike(String name) {
        List<Students> res = SelectbyName.getByName(name);
        return res;
    }
    public static StudentRepositoryImpl getInstance(){
        StudentRepositoryImpl pattern = new StudentRepositoryImpl();
        return pattern;
    }
}
