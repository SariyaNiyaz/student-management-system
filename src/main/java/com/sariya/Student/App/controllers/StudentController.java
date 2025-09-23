package com.sariya.Student.App.controllers;



import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sariya.Student.App.models.Student;
import com.sariya.Student.App.models.StudentDto;
import com.sariya.Student.App.repository.StudentRepo;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentRepo studentRepo;
	
	@GetMapping({"", "/"})
	public String getStudents(Model model) {
		var students=studentRepo.findAll(Sort.by(Sort.Direction.ASC,"id"));
		model.addAttribute("students",students);
		return "students/index";
	}
	@GetMapping("/create")
	public String createStudent(Model model)
	{
		StudentDto studentdto=new StudentDto();
		model.addAttribute("studentDto",studentdto);
		return "students/create";
	}
	@PostMapping("/create")
	public String createStudent(@Valid @ModelAttribute StudentDto studentDto,BindingResult result)
	{
		if(studentRepo.findByEmail(studentDto.getEmail())!=null) {
			result.addError(new FieldError("studentDto","email", studentDto.getEmail(),false,null,null,"Email Address is already used"));
		}
		if(result.hasErrors()) {
			return "students/create";
		}
		Student student=new Student();
		student.setName(studentDto.getName());
		student.setRollno(studentDto.getRollno());
		student.setEmail(studentDto.getEmail());
		student.setYear(studentDto.getYear());
		student.setBranch(studentDto.getBranch());
		student.setPhone(studentDto.getPhone());
		student.setAddress(studentDto.getAddress());
        studentRepo.save(student);
		return "redirect:/students";
	}
	@GetMapping("/edit")
	public String editStudent(Model model,@RequestParam int id)
	{
	  Student student=studentRepo.findById(id).orElse(null);
	  if(student==null)
	  {
		  return "redirect:/students";
	  }
		StudentDto studentDto=new StudentDto();
		studentDto.setName(student.getName());
		studentDto.setRollno(student.getRollno());
		studentDto.setEmail(student.getEmail());
		studentDto.setYear(student.getYear());
		studentDto.setBranch(student.getBranch());
		studentDto.setPhone(student.getPhone());
		studentDto.setAddress(student.getAddress());
		
		model.addAttribute("student",student);
        model.addAttribute("studentDto",studentDto);
        
        return "students/edit";
	}
	@PostMapping("/edit")
	public String editStudent(Model model,@RequestParam int id,@Valid @ModelAttribute StudentDto studentDto,BindingResult result)
	{
		Student student=studentRepo.findById(id).orElse(null);
		if(student==null)
		{
			return "redirect:/students";
		}
	
		model.addAttribute("student",student);
		if(result.hasErrors())
		{
			return "students/edit";
		}
		//update students:
		student.setName(studentDto.getName());
		student.setRollno(studentDto.getRollno());
		student.setEmail(studentDto.getEmail());
		student.setYear(studentDto.getYear());
		student.setBranch(studentDto.getBranch());
		student.setPhone(studentDto.getPhone());
		student.setAddress(studentDto.getAddress());
		try{
			studentRepo.save(student);
		}
		catch(Exception ex)
		{
			result.addError(new FieldError("studentDto", "email", studentDto.getEmail(),false,null,null,"Email address already in use"));
		 return "students/edit";
		}
		return "redirect:/students";
	}
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam int id) {
		Student student=studentRepo.findById(id).orElse(null);
		if(student!=null)
		{
			studentRepo.delete(student);
		}
		return "redirect:/students";
	}
}