package com.lalthanpuia.springboot.kelvin.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lalthanpuia.springboot.kelvin.dao.StudentRepository;
import com.lalthanpuia.springboot.kelvin.entity.StudentEntity;

@Controller
public class StudentController {

	private StudentRepository studentRepository;
	
	public StudentController(StudentRepository theStudentRepository) {
		
		studentRepository = theStudentRepository;
	}
	
//	@GetMapping("/showAll")
//	public String listAll(Model theModel) {
//		
//		List<StudentEntity> theStudentEntity = studentRepository.findAll();
//		//
//		theModel.addAttribute("studentEntity",theStudentEntity);
//		
//		return "student/student-list";
//		//return "student/test";
//	}	
//	@GetMapping("/showAll")
//	public String listAll(Model theModel) {
//		
//		//List<StudentEntity> theStudentEntity = ( studentRepository).findByStandard("8");
//		List<StudentEntity> theStudentEntity = studentRepository.findAll();
//		//
//		theModel.addAttribute("studentEntity",theStudentEntity);
//		
//		return "student/student-list";
//		//return "student/test";
//	}
	
	@GetMapping("/showAll")
	public String listAll(Model theModel) {
		
		//List<StudentEntity> theStudentEntity = ( studentRepository).findByStandard("8");
		List<StudentEntity> theStudentEntity = studentRepository.findAll();
		//
		theModel.addAttribute("studentEntity",theStudentEntity);
		
		return "student/main-page";
		//return "student/test";
	}
	
	@GetMapping("/adminShowAll")
	public String adminShowAll(Model theModel) {
		
		List<StudentEntity> theStudentEntity = studentRepository.findAll();
		
		theModel.addAttribute("studentEntity",theStudentEntity);
		
		return "student/admin-student-list";
		//return "student/test";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		StudentEntity theStudentEntity = new StudentEntity();
		theModel.addAttribute("studentEntity", theStudentEntity);
		return "/student/student-form";
	}
	
	@PostMapping("/showFormForAdd")		
	public String showFormValidation(@Valid StudentEntity theStudentEntity, BindingResult bindingResult,Model theModel) {
	
	if(bindingResult.hasErrors())
	{
		return "/student/student-form";
	}else {
		studentRepository.save(theStudentEntity);
		
		return "redirect:/showAll";
		
	}

	
	
	
	
	
}

	
//	
//	@PostMapping("save")
//	public String save(@ModelAttribute("studentEntity") StudentEntity theStudentEntity) {
//		
//		studentRepository.save(theStudentEntity);
//		
//		return "redirect:/showAll";
//	}
	
	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int theId, Model theModel) {
		
		theModel.addAttribute("studentEntity",studentRepository.findById(theId));
		
		return "/student/student-form";
	}
	
	//SHOW TABLE FOR ONLY CLASS 0NE
	@GetMapping("/showClassOne")
	public String showClassOne(Model theModel) {
		
		List<StudentEntity> theStudentEntity = ( studentRepository).findByStandard("1");

		theModel.addAttribute("studentEntity",theStudentEntity);
	
		return "/student/class-one/class-one-page";
	}
	
	@RequestMapping("/login")
	public String showLogin() {
		return "/login";
	}
	
	@GetMapping("/rere")
	public String re() {
		
		return "ree";
	}
}											











