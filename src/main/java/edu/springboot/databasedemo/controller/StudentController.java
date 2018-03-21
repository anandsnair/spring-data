package edu.springboot.databasedemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.springboot.databasedemo.model.Laptop;
import edu.springboot.databasedemo.model.Student;
import edu.springboot.databasedemo.repository.LaptopRepository;
import edu.springboot.databasedemo.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentRepository sRepository;
	
	@Autowired
	LaptopRepository lRepository;
	
	
	@PostMapping("/student")
	public Student createStudent(@RequestBody Student student) {
		//lRepository.save(student.getLaptop());
		return sRepository.save(student);
	}
		
	@PutMapping("/studentWithNewlaptop")
	public Student updateStudentWithNewLaptop(@RequestBody Student student) {
		Optional<Student> s = sRepository.findById(student.getRollNumber());
		Student updateStudent = s.get();
		updateStudent.setLaptop(student.getLaptop());
		//updateStudent.getLaptop().setlId(student.getLaptop().getlId());
		return sRepository.save(updateStudent);
	}

	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
	    return sRepository.findAll();
	}

}
