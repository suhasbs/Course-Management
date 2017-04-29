/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseClasses;

import com.firebase.client.Firebase;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Suhas
 */
public class Create_Account {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = in.nextLine();
        System.out.println("Enter password");
        String pass = in.nextLine();
        System.out.println("Enter the account type");
        int accType = in.nextInt();
        String url = "https://course-management-3edd4.firebaseio.com/";
        Firebase dataRef = new Firebase(url);
        Firebase newUser = dataRef.child("Users");
        DatabaseClasses.User st = new DatabaseClasses.User();
        st.setUserName(userName);
        st.setPassword(pass);
        st.setAccountType(accType);
        newUser.push().setValue(st);
        while(true);
    }
     
    
}
