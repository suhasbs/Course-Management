/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import DatabaseClasses.Course;
import DatabaseClasses.CourseDetails;
import DatabaseClasses.Student;
import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.Query;
import com.firebase.client.ValueEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Suhas
 */

public class Student_View_Courses extends javax.swing.JFrame {

    static Student st;
    
    static String studentName;
static ArrayList<String> coursesTaken_copy = new ArrayList();
static ArrayList<String> allCourses_copy = new ArrayList();
    /**
     * Creates new form Student_View_Courses
     */
    public Student_View_Courses(String studentName) {
        Student_View_Courses.studentName = studentName;
        initComponents();
        //DefaultListModel listModel = new DefaultListModel();
        //listModel.addElement("Suhas");
        
        //jList2 = new javax.swing.JList<>(listModel);
    String url = "https://course-management-3edd4.firebaseio.com/";
    Firebase dataRef = new Firebase(url);
    Firebase students = dataRef.child("Students");
    Query queryRef = students.orderByChild("studentName").equalTo(studentName);
  
   //queryRef.addListenerForSingleValueEvent(new ValueEventListener() {
    
            queryRef.addChildEventListener(new ChildEventListener() {
                
    //public void onDataChange(DataSnapshot snapshot) {
       public void onChildAdded(DataSnapshot snapshot, String previousChild) {
            System.out.println("POP JLST 2");
        
        Student s = snapshot.getValue(Student.class);
        if(s.getStudentName().equals( "Aditya A"))
        System.out.println("Student object: "+s);
        //System.out.println(snapshot.getKey() + " is " + s.getStudentName() + " "+s.getCoursesTaken());
        ArrayList<String> coursesTaken = new ArrayList();
        coursesTaken = s.getCoursesTaken();
        //ArrayList<String> coursesTaken;
        //snapshot.child("coursesTaken").getValue();
        //System.out.println(s.getCoursesTaken());
        if(coursesTaken!=null)
        coursesTaken_copy = coursesTaken;
        int i;
        if(coursesTaken!=null)
       jList2.setModel(new javax.swing.AbstractListModel<String>() {
            ArrayList<String> strings = coursesTaken_copy;
            @Override
            public int getSize() { return strings.size(); }
            @Override
            public String getElementAt(int i) { return strings.get(i); }
        });
//        for(i=0;i<coursesTaken.size();i++)
//            {
//                listModel.addElement(coursesTaken.get(i));
//            }
//        for(i=0;i<5;i++)
//            {
//                listModel.addElement("Daitya");
//            }
       
        //jList2 = new javax.swing.JList(listModel);
    
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

            

//            @Override
//            public void onCancelled(FirebaseError fe) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }

       

               
    });

    
    
    
    
    Firebase courses = dataRef.child("Courses");
    Query queryRef1 = courses.orderByChild("courseName");
    
    ArrayList<String> allCoursesTaken = new ArrayList();
        queryRef1.addChildEventListener(new ChildEventListener() {
    @Override
    public void onChildAdded(DataSnapshot snapshot, String previousChild) {
        Course c  = snapshot.getValue(Course.class);
        System.out.println(snapshot.getKey() + " is " + c.getCourseName() + " ");//+.getCoursesTaken());
        
        allCoursesTaken.add(c.getCourseName());
        allCourses_copy.add(c.getCourseName());
        System.out.println("All courses = "+allCoursesTaken);
        int i;
        ArrayList s = new ArrayList();
        s.add("A");
        if(allCourses_copy!=null)
       jList1.setModel(new javax.swing.AbstractListModel<String>() {
            ArrayList<String> strings = allCoursesTaken ;
            
            //allCourses_copy = allCoursesTaken;
            @Override
            public int getSize() { return strings.size(); }
            @Override
            public String getElementAt(int i) { return strings.get(i); }
        });
//        for(i=0;i<coursesTaken.size();i++)
//            {
//                listModel.addElement(coursesTaken.get(i));
//            }
//        for(i=0;i<5;i++)
//            {
//                listModel.addElement("Daitya");
//            }
       
        //jList2 = new javax.swing.JList(listModel);
    
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
    System.out.println("Here already");
    
    
    //while(true);
    }
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList2);

        jLabel1.setText("Registered Courses");

        jLabel2.setText("All Courses");

        jButton2.setText("Deregister");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String sel = jList1.getSelectedValue();
        System.out.println("Sel is"+sel);
        if(coursesTaken_copy == null || !coursesTaken_copy.contains(sel))
        {
            coursesTaken_copy.add(sel);
            jList2.setModel(new javax.swing.AbstractListModel<String>() {
            ArrayList<String> strings = coursesTaken_copy;
            @Override
            public int getSize() { return strings.size(); }
            @Override
            public String getElementAt(int i) { return strings.get(i); }
        });
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String sel = jList2.getSelectedValue();
        if(sel!=null)
        {
            coursesTaken_copy.remove(sel);
            jList2.setModel(new javax.swing.AbstractListModel<String>() {
            ArrayList<String> strings = coursesTaken_copy;
            @Override
            public int getSize() { return strings.size(); }
            @Override
            public String getElementAt(int i) { return strings.get(i); }
        });
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
    System.out.println("Submit clicked");    
    String url = "https://course-management-3edd4.firebaseio.com/";
    Firebase dataRef = new Firebase(url);
    Firebase students = dataRef.child("Students");
    Query queryRef = students.orderByChild("studentName");//.equalTo("Aditya A");
    System.out.println("Here");
    System.out.println(queryRef);    
    queryRef.addListenerForSingleValueEvent(new ValueEventListener() {
    @Override
    public void onDataChange(DataSnapshot snapshot) {
        // do some stuff once
        Student s;
         for (DataSnapshot postSnapshot: snapshot.getChildren()){
            s = postSnapshot.getValue(Student.class);
            if(s.getStudentName().equals(studentName))
            {
                st = s;
                System.out.println("Courses Taken:"+coursesTaken_copy);
            //s.setCoursesTaken(coursesTaken_copy);
                postSnapshot.getRef().child("coursesTaken").setValue(coursesTaken_copy);
                addStudentToEnrolledList(s.getStudentName());
//                Firebase addStRef = dataRef.child("Course_Details");
//                Query queryRef = students.orderByChild("courseName");
//                
//                queryRef.addListenerForSingleValueEvent(new ValueEventListener() {
//                @Override
//                public void onDataChange(DataSnapshot snapshot) { 
//                
//                    CourseDetails cd = new CourseDetails();
//                    for (DataSnapshot CD: snapshot.getChildren()){
//                        cd = CD.getValue(CourseDetails.class);
//                        System.out.println(cd);
//                        if(coursesTaken_copy.contains(cd.getCourse().getCourseName()))
//                        {
//                            ArrayList<Student> stEnr = new ArrayList();
//                            if(cd.getStudentsEnrolled()!=null)
//                            {
//                                stEnr = cd.getStudentsEnrolled();
//                                
//                                
//                            }
//                            stEnr.add(st);
//                            CD.getRef().child(cd.getCourse().getCourseName()).child("studentsEnrolled").setValue(stEnr);
//                                
//                                        
//                        } 
//
//                        }
//                    }
//                  @Override
//                        public void onCancelled(FirebaseError firebaseError) {
//                        }
//    });
                
                break;
            }
        }
       
    }
    @Override
    public void onCancelled(FirebaseError firebaseError) {
    }
});
    
//        queryRef.addChildEventListener(new ChildEventListener() {
//            
//    @Override
//    public void onChildAdded(DataSnapshot snapshot, String previousChild) {
//        System.out.println("Here");
//        Student s = snapshot.getValue(Student.class);
//        System.out.println("Here also");
//        System.out.println(snapshot.getKey() + " is " + s.getStudentName() + " "+s.getCoursesTaken());
//        //ArrayList<String> coursesTaken = s.getCoursesTaken();
//        //coursesTaken_copy = coursesTaken;
//        System.out.println("Pushing");
//        s.setCoursesTaken(coursesTaken_copy);
//        
//        students.push().setValue(s);
//      
//       
////        for(i=0;i<coursesTaken.size();i++)
////            {
////                listModel.addElement(coursesTaken.get(i));
////            }
////        for(i=0;i<5;i++)
////            {
////                listModel.addElement("Daitya");
////            }
//       
//        //jList2 = new javax.swing.JList(listModel);
//    
//}
//
//        @Override
//        public void onChildChanged(DataSnapshot ds, String string) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void onChildRemoved(DataSnapshot ds) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void onChildMoved(DataSnapshot ds, String string) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void onCancelled(FirebaseError fe) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//    });
    
 
        



    
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Student_View_Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_View_Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_View_Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_View_Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Student_View_Courses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

public void addStudentToEnrolledList(String s)
{   
    //for each course in coursesTaken_copy, add student added to enrolled list
    String url = "https://course-management-3edd4.firebaseio.com/";
    Firebase dataRef = new Firebase(url);
    Firebase students = dataRef.child("Courses");
    Query queryRef = students.orderByChild("courseName");
    
    queryRef.addListenerForSingleValueEvent(new ValueEventListener() {
    @Override
    public void onDataChange(DataSnapshot snapshot) {
        // do some stuff once
        Course c;
        for (DataSnapshot postSnapshot: snapshot.getChildren())
        {
            c = postSnapshot.getValue(Course.class);
            if(coursesTaken_copy.contains(c.getCourseName()))
            {
                HashMap<String, Integer> att = new HashMap();
                if(c.getAttendance()!=null )
                {
                    att = c.getAttendance();
                    
                }
                att.put(s, 0);
                postSnapshot.getRef().child("attendance").setValue(att);
            }
            
                
        }
       
    }
    @Override
    public void onCancelled(FirebaseError firebaseError) {
    }
});
    
}

}
