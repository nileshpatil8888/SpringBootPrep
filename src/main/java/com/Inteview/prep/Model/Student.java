package com.Inteview.prep.Model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.id.IdentityGenerator;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
/**Model class : Also known as DTO class , ALso Known as POJO class, with the help of this class we can structure our database or
 * whatever info we need to store in database so we defined here with all the database configurations.*/
@Entity
@Table( name = "student")
public class Student {

    public Student(){} //default constructor

    @Id
    private String id;

    @Column
    @NotNull
    private String name;
    @Column
    private int rollNumber;
    @Column
    private String city;
    //constructor
    public Student(String id, String name, int rollNumber, String city) {
        this.id = id;
        this.name = name;
        this.rollNumber = rollNumber;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
