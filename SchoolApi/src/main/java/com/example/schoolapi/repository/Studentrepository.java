package com.example.schoolapi.repository;

import model.Students;

import java.util.List;

public interface Studentrepository  {
    List<Students> findAll();

    Students save(String s);


    String deleteById(Long id);

    Students updateNameById(Long id, String newName);

    List<Students> findWhereNameLike(String query);
    // Select * from students where name like '%query%'
}
//implémentez cette interface avec une classe concrète avec JDBC (faites en sorte de
// convertir le resultset en list) Fait
// Devoir de recherche :
// Proposez une autre implémentation avec JPQL (Java Persistence Query Language)
// *** voir anotation @Query
