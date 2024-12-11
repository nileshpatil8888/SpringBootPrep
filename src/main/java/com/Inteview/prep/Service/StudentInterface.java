package com.Inteview.prep.Service;

import com.Inteview.prep.Model.Student;

interface StudentInterface {

    Student create(Student student);
    Student getStudent(String id);
    String deleteStudent(String id);

}
