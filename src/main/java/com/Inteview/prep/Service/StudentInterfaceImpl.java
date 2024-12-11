package com.Inteview.prep.Service;

import com.Inteview.prep.Model.Student;
import com.Inteview.prep.Repository.StudentRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

//This service class holds the business logic of application.
@Service
@Configuration
public class StudentInterfaceImpl implements StudentInterface {
    StudentRepository studentRepository;
    //constructor required otherwise it will throw null pointer
    public StudentInterfaceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudent(String id) {
        var student = studentRepository.findById(Integer.valueOf(id)).get();
        return student;
    }

    @Override
    public String deleteStudent(String id) {
        studentRepository.deleteById(Integer.valueOf(id));
        return "deleted";
    }
}
