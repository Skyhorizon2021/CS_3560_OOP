package com.example;

import java.sql.Date;
import java.util.*;

import com.example.school;
import com.example.instructor;
import com.example.student;
import com.example.lecture_halls;
public class Class {
    /**
     * holds value for a class
     * @param location, instructorID, class_name
     * @return Room get assigned, assign instructor to a class, set a class as prerequisite
     *
     *
     */
    String name;
    Date date;
    List studentList;

    public void assignLectureHall(String location){}
    public void assignInstructor(int instructorID){}
    public void displayStudentList(){}
    public void setAsPrerequisites(String class_name){}
}
