package com.mymondayproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mymondayproject.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
