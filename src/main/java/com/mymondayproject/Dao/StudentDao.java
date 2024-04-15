package com.mymondayproject.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mymondayproject.entity.Student;
import com.mymondayproject.repository.StudentRepository;

@Repository

public class StudentDao {
	@Autowired
	StudentRepository sr;
	public String postAll(List<Student> a) {
		sr.saveAll(a);
		return "posted Successfully";
	}
	
	public List<Student> getAll() {
		return sr.findAll();
	}
	
	
}
