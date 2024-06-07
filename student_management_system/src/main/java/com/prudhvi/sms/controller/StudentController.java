package com.prudhvi.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.prudhvi.sms.entities.Student;
import com.prudhvi.sms.services.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	// handler method to handle list students and return mode and view

	@GetMapping("/students")
	public String listStudents(Model model) {

		model.addAttribute("students", studentService.getAllStudents());
		return "students";

	}

	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute Student student, Model model) {

		studentService.saveStudent(student);
		return "redirect:/students";
	}

	@GetMapping("students/edit/{id}")
	public String editStudent(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}

	@PostMapping("students/edits/{id}")
	public String editStudent1(@PathVariable Long id, Model model) {
		System.out.println("Inside edits......");
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {

		// get student from database

		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(student.getId());
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());

		// save update student object

		studentService.updateStudent(existingStudent);

		return "redirect:/students";
	}
	@DeleteMapping("/students/delete/{id}")
	public String delete (@PathVariable Long id, @ModelAttribute Student student , Model model) {
		System.out.println("Inside delete......");
		
		 studentService.deleteStudent(id);
		 return "redirect:/students";
		
	}

}
