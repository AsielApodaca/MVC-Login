/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Oliver Inzunza, Hisamy Cinco, Gael Castro, Asiel Apodaca
 */
public class LoginModel {
    
    private String user;
    private String password;
    
    public LoginModel() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
     public boolean validateCredentials() {
        return "admin".equals(user) && "password".equals(password);
    }
    
}
