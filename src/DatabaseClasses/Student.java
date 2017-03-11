/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseClasses;

import java.util.ArrayList;
import java.util.HashMap;
import com.firebase.client.*;

/**
 *
 * @author Suhas
 */
public class Student {
    
    String studentName;
    String regNumber;
    
    ArrayList<String> coursesTaken;
    HashMap<Course,Float> attendance;
    public Student()
    {
        
    }
    
    public String getStudentName()
    {
        return studentName;
    }
    
    public String getRegNumber()
    {
        return regNumber;
    }
    
    public ArrayList<String> getCoursesTaken()
    {
        return coursesTaken;
    }
    
    //To add students to database and retrieve
    
    public static void main(String args[])
    {
    /*    String url = "https://course-management-3edd4.firebaseio.com/";
        Firebase dataRef = new Firebase(url);
        Firebase students = dataRef.child("Students");
        Student s = new Student();
        s.studentName = "Aditya A";
        s.regNumber = "15IT201";
        s.coursesTaken = new ArrayList();
        s.coursesTaken.add("DAA");
        s.coursesTaken.add("Unix");
        s.coursesTaken.add(null);
        students.push().setValue(s);
        while(true);
        
        
        
    }
    */        
    
    String url = "https://course-management-3edd4.firebaseio.com/";
    Firebase dataRef = new Firebase(url);
    Firebase students = dataRef.child("Students");
    Query queryRef = students.orderByChild("studentName").equalTo("Aditya A");
    
    queryRef.addChildEventListener(new ChildEventListener() {
    @Override
    public void onChildAdded(DataSnapshot snapshot, String previousChild) {
        Student s = snapshot.getValue(Student.class);
        System.out.println(snapshot.getKey() + " is " + s.studentName + " "+s.coursesTaken);
    
}

        @Override
        public void onChildChanged(DataSnapshot ds, String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void onChildRemoved(DataSnapshot ds) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void onChildMoved(DataSnapshot ds, String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void onCancelled(FirebaseError fe) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });
    while(true);
    }
}
