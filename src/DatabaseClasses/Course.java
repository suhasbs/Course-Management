/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseClasses;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Suhas
 */
public class Course {
    
    String courseName;
    String courseCode;
    ArrayList<Faculty> facultyHandling;
    HashMap<String, Integer> attendance;
    int totalClassesTaken;
    //Branch branch;
    
    public Course()
    {
        
    }
    
    public Course(String name, String code)
    {
        courseName = name;
        courseCode = code;
        //facultyHandling = fac;
        
    }
    
     public Course(String name, String code, ArrayList<Faculty> fac, int classes)
    {
        courseName = name;
        courseCode = code;
        facultyHandling = fac;
        totalClassesTaken = classes;
        
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    public void setCourseName(String name)
    {
        courseName = name;
    }
    public String getCourseCode()
    {
        return courseCode;
    }
    public void setCourseCode(String code)
    {
        courseCode = code;
    }
    public ArrayList<Faculty> getFaculty()
    {
        return facultyHandling;
    }
    public void setFaculty(ArrayList<Faculty> f)
    {
        facultyHandling = f;
    }
   // public Branch getBranch()
    {
     //   return branch;
 
    }
    
    public int getTotalClassesTaken()
    {
        return totalClassesTaken;
    }
    
    public void setTotalClassesTaken(int t)
    {
        totalClassesTaken = t;
    }
    
    public HashMap<String, Integer> getAttendance()
    {
        return attendance;
    }
    
    
    public void setAttendance(HashMap<String, Integer> a)
    {
        attendance = a;
    }
           
    
}
