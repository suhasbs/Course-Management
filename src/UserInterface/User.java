/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

/**
 *
 * @author Suhas
 */
public class User {
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