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
public class CourseDetails {
    
    Course c;
    ArrayList<Student> studentsEnrolled;
    int totalClassesTaken;
    HashMap<Student, Integer> attendance;
    
    
    public CourseDetails()
    {
        
    }
    
    public CourseDetails(Course cor)
    {
        c = cor;
        studentsEnrolled = null;
        totalClassesTaken = 0;
        attendance = null;
    }
    
    
    public Course getCourse()
    {
        return c;
    }
    
    public void setCourse(Course cor)
    {
        c = cor;
    }
    
     public int getTotalClassesTaken()
    {
        return totalClassesTaken;
    }
    
    public void setTotalClassesTaken(int t)
    {
        totalClassesTaken = t;
    }
    
    
     public ArrayList<Student> getStudentsEnrolled()
    {
        return studentsEnrolled;
    }
    
    public void setStudentsEnrolled(ArrayList<Student> s)
    {
        studentsEnrolled = s;
    }
    
    
    public HashMap<Student, Integer> getAttendance()
    {
        return attendance;
    }
    
    
    public void setAttendance(HashMap<Student, Integer> a)
    {
        attendance = a;
    }
    
    
}
