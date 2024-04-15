package com.mymondayproject.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mymondayproject.MyMondayProjectApplication;
import com.mymondayproject.Services.StudentService;
import com.mymondayproject.entity.Student;
import com.mymondayproject.exception.NoAgeException;

@RestController
public class StudentController {
	@Autowired 
	StudentService ss;
	static Logger log =Logger.getLogger(MyMondayProjectApplication.class);
	@PostMapping(value="/postAll")
	public String postAll(@RequestBody List<Student>a)throws NoAgeException {
		PropertyConfigurator.configure("mymonday.properties");
		log.info(ss.postAll(a));
		return ss.postAll(a);
	}
	
	@GetMapping(value="/getAll")
	public List<Student> getAll() {
		PropertyConfigurator.configure("mymonday.properties");
		log.info(ss.getAll());
		return ss.getAll();
	}

}
