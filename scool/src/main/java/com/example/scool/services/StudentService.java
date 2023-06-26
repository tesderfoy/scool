package com.example.scool.services;

import com.example.scool.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();
    private long ID = 0;

    {
        students.add(new Student(++ID,"Efim", "dataBazov")) ;
        students.add( new Student(++ID,"Egor","Sytylyi"));
    }

    public List<Student> listStudent(){return students;}

    public void saveStudent(Student student){
        student.setId(++ID);
        students.add(student);
    }

    public void deleteStudent(Long id){
        students.removeIf(student -> student.getId().equals(id));


    }

    public Student getStudentById(Long id) {
       for (Student student :students){
           if(student.getId().equals(id)) return  student;
       }
       return null;
    }
}
