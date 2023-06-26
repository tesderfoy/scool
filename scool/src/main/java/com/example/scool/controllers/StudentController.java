package com.example.scool.controllers;


import com.example.scool.models.Student;
import com.example.scool.services.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/")
    public String student(Model model){
model.addAttribute("students", studentService.listStudent());
        return "student";
    }
@GetMapping("/student/{id}")
    public String StudentInfo(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
return "student-info";
    }



    @PostMapping("/student/create")
public String createStudent(Student student){
        studentService.saveStudent(student);
        return "redirect:/";
}
@PostMapping("/student/delete/{id}")
public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    return "redirect:/";
}


}
