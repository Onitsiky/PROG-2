package com.example.schoolapi.repository;

import model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepositoryJPQL extends JpaRepository<Students,Long> {
    @Query("SELECT i FROM Students i")
    List<Students> findAll();

    @Query("DELETE from Students s where s.id= :id ")
    void deleteById(@Param("id") Long id);

    @Query("SELECT i FROM Students i WHERE i.name LIKE '%:name%'")
    List<Students> findByName(@Param("name") String name);

}
