package com.mymondayproject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymondayproject.Dao.StudentDao;
import com.mymondayproject.entity.Student;
import com.mymondayproject.exception.NoAgeException;

@Service

public class StudentService {
	@Autowired
	StudentDao Sd;
	public String postAll(List<Student> a)throws NoAgeException {
		for(Student s:a) {
			if(s.getAge()<18) {
				throw new NoAgeException ("Studnet age must be greater than 18 ");
			}
		}
		return Sd.postAll(a);
	}
	public List<Student>getAll(){
		return Sd.getAll();
	}
 
}
