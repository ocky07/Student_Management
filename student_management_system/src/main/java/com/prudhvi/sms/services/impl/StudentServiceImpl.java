package com.prudhvi.sms.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prudhvi.sms.entities.Student;
import com.prudhvi.sms.repository.StudentRepository;
import com.prudhvi.sms.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	
	private StudentRepository studentRepository ;
	
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	


	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}




	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}




	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	
	@Override
	public void deleteStudent(Long id) {
		 studentRepository.deleteById(id);
	}
	
	

}
