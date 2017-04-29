/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseClasses;

/**
 *
 * @author Suhas
 */
public class User {
    
    String userName;
    String password;
    int accountType;
    
    public void setUserName(String name)
    {
        userName = name;
    }
    
    public String getUserName()
    {
        return userName;
    }
    
    public void setPassword(String pass)
    {
        password = pass;
    } 
    
    public String getPassword()
    {
        return password;
    }
    
    public void setAccountType(int type)
    {
        accountType = type;
    } 
    public int getAccountType()
    {
        return accountType;
    }
    
    
}
