package com.example.scool.controllers;

import com.example.scool.models.Admin;
import com.example.scool.models.User;
import com.example.scool.repositories.AdminRepository;
import com.example.scool.repositories.TeacherRepository;
import com.example.scool.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Controller
@RequiredArgsConstructor
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/admin")
    public String Admins(Model model) {
        List<Admin> admins = adminRepository.findAll();
        model.addAttribute("admins", admins);
        return "admin-panel";
    }
    @GetMapping("/admin/table")
    public String showAdmins(Model model) {
        List<Admin> admins = adminRepository.findAll();
        model.addAttribute("admins", admins);
        return "admin-table";
    }
    @PostMapping("/admin/create")
    public String createAdmin(Admin admin){

        return "redirect:/";
    }
/**
    @GetMapping("admin/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable Long id) {
        Admin admin = adminService.getAdminById(id);
        if (admin == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(admin, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin) {
        Admin createdAdmin = adminService.addAdmin(admin);
        return new ResponseEntity<>(createdAdmin, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Admin> updateAdmin(@PathVariable Long id, @RequestBody Admin admin) {
        Admin existingAdmin = adminService.getAdminById(id);
        if (existingAdmin == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        existingAdmin.setUsername(admin.getUsername());
        existingAdmin.setPassword(admin.getPassword());
        existingAdmin.setEmail(admin.getEmail());
        Admin updatedAdmin = adminService.updateAdmin(existingAdmin);
        return new ResponseEntity<>(updatedAdmin, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteAdminById(@PathVariable Long id) {
        adminService.deleteAdminById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    **/
}
