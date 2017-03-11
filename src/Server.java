/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suhas
 */
import com.firebase.client.*;
import static java.lang.System.exit;
import static java.lang.Thread.sleep;
import java.util.concurrent.atomic.AtomicBoolean;

class User {
    private int birthYear;
    private String fullName;
    public User() {}
    public User(String fullName, int birthYear) {
        this.fullName = fullName;
        this.birthYear = birthYear;
    }
    public long getBirthYear() {
        return birthYear;
    }
    public String getFullName() {
        return fullName;
    }
}


public class Server {

//  public static void main(String args[]) throws Exception {
//
//    String url = "https://course-management-3edd4.firebaseio.com/";
//    Firebase dataRef = new Firebase(url);
//    Firebase alanRef = dataRef.child("users").child("alanisawesome");
//    User alan = new User("Suhassla", 2017);
////    alanRef.push().setValue(alan);
//    final AtomicBoolean done = new AtomicBoolean(false);
////    alanRef.push().setValue(alan, new Firebase.CompletionListener() {
////    @Override
////    public void onComplete(FirebaseError firebaseError, Firebase firebase) {
////   
////        if (firebaseError != null) {
////            System.out.println("Data could not be saved. " + firebaseError.getMessage());
////        } else {
////            System.out.println("Data saved successfully.");
////        }
////        done.set(true);
////        System.out.println("done.get "+done.get());
////        
////        
////    }
////    
////});
//    Query queryRef = dataRef.child("users").child("alanisawesome").orderByChild("fullName").equalTo("Rakshit");
//    queryRef.addChildEventListener(new ChildEventListener() {
//    @Override
//    public void onChildAdded(DataSnapshot snapshot, String previousChild) {
//        User facts = snapshot.getValue(User.class);
//        System.out.println(snapshot.getKey() + " was " + facts.getBirthYear() + " ");
//    
//        done.set(true);
//    }
//    // ....
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
//        
//    });
//    /**** Reading Data****************
//    dataRef.addValueEventListener(new ValueEventListener() {
//    @Override
//    public void onDataChange(DataSnapshot snapshot) {
//        System.out.println(snapshot.getValue());
//    }
//    @Override
//    public void onCancelled(FirebaseError firebaseError) {
//        System.out.println("The read failed: " + firebaseError.getMessage());
//    }
//    
//});
//*********************Reading Data*****************/    
//   
//
//    while(!done.get())
//    {
//        //System.out.println("Stuck here");
//    }
//    
//    
//    //exit(1);
//    //dataRef.setValue("FromNetBeans");
//    //dataRef.child("Name").setValue("FromNetBeans");
//    //dataRef.child("Value").setValue("20");
//    
//    
//    //System.out.println("Data Added");
//  
//   }
}
