package com.example.scool.controllers;


import com.example.scool.models.User;
import com.example.scool.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;



//Admin

    /**
@GetMapping("/admin/adm")
public String admin(Model model){
    model.addAttribute("students", userService.getAllUsers());
    return "admin-panel";
}
    @GetMapping("/admin/adm/{id}")
    public String adminInfo(@PathVariable Long id, Model model){
        model.addAttribute("admin", userService.getUserById(id));
        return "admin-info";
    }

    @PostMapping("/admin/adm/create")
    public String createAdmin(User user){
        userService.addUser(user);
        return "redirect:/";
    }
    @PostMapping("/admin/adm/delete/{id}")
    public String deleteAdmin(@PathVariable Long id){
        userService.deleteUserById(id);
        return "redirect:/";
    }

**/


    //Teacher


/**

    @GetMapping("/a")
    public String teacher(Model model){
        model.addAttribute("students", userService.getAllUsers());
        return "student";
    }
    @GetMapping("/student/{id}")
    public String teacherInfo(@PathVariable Long id, Model model){
        model.addAttribute("student", userService.getUserById(id));
        return "student-info";
    }

    @PostMapping("/student/create")
    public String createTeacher(User user){
        userService.addUser(user);
        return "redirect:/";
    }
    @PostMapping("/student/delete/{id}")
    public String deleteTeacher(@PathVariable Long id){
        userService.deleteUserById(id);
        return "redirect:/";
    }

    **/

    //Student
    @GetMapping("/")
    public String student(Model model){
model.addAttribute("students", userService.getAllUsers());
        return "student.html";
    }
@GetMapping("/student/{id}")
    public String StudentInfo(@PathVariable Long id, Model model){
        model.addAttribute("student", userService.getUserById(id));
return "student-info.html";
    }
    @PostMapping("/student/create")
public String createStudent(User user){
        userService.addUser(user);
        return "redirect:/";
}
@PostMapping("/student/delete/{id}")
public String deleteStudent(@PathVariable Long id){
        userService.deleteUserById(id);
    return "redirect:/";
}


}
