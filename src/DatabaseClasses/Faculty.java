/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseClasses;

import java.util.ArrayList;

/**
 *
 * @author Suhas
 */
public class Faculty {
    
    String facultyName;
    String designation;
    //Branch branch;
   ArrayList<Course> coursesHandled;

   public Faculty()
   {
       coursesHandled = new ArrayList();
         
   }
   
   
   public Faculty(String name, String desig, ArrayList<Course> c)
   {
       facultyName = name;
       designation = desig;
       coursesHandled = c;
   }
   
   public void setFacultyName(String name)
   {
       facultyName= name;
   }
   
   public String getFacultyName()
   {
       return facultyName;
   }
   public void setDesignation(String des)
   {
       designation = des;
   }
   
   public String getDesignation()
   {
       return designation;
   }
   
   public void setCoursesHandled(ArrayList<Course> courses)
   {
       coursesHandled = courses;
   }
   public ArrayList<Course> getCoursesHandled()
   {
       return coursesHandled;
   }
   
}

