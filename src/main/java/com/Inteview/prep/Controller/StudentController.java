package com.Inteview.prep.Controller;

import com.Inteview.prep.Model.Student;
import com.Inteview.prep.Service.StudentInterfaceImpl;
import org.springframework.web.bind.annotation.*;

/**This controller class holds the HTTP web requests in spring mvc, typically handling HTTP requests and returning the views or responses.
 * */
@RestController /** This annotation is used to create the restful apis, and It combines @controller @Response body annotations.*/
@RequestMapping("/student") //Map Http web request to URI
public class StudentController {

    StudentInterfaceImpl studentInterface;
    //constructor required otherwise it will throw null pointer
    public StudentController(StudentInterfaceImpl studentInterface) {
        this.studentInterface = studentInterface;
    }

    @PostMapping() //This annotation is used to store or create the data. @RequestBody annotation is used for accept the input and pass to process the data operation.
    public Student create(@RequestBody Student student){
        return studentInterface.create(student);
    }

    @GetMapping("/{id}") //This Annotation is helps to fetch the data from the database with the help of that id.
    public Student getInfo(@PathVariable String id){
        return studentInterface.getStudent(id);
    }
    @DeleteMapping("/{id}") //Delete Mapping helps us to delete the data from database by using that id.
    //@PathVariable annotation indicates that this request required parameter to query the database for doing the operation.
    public String delete(@PathVariable String id){
        studentInterface.deleteStudent(id);
        return "delete";
    }
}
