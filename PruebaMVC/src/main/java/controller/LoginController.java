/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.LoginModel;
import view.LoginView;

/**
 *
 * @author olive
 */
public class LoginController {
    
    private LoginView view ;
    private LoginModel model ;
    
    public LoginController(LoginView view, LoginModel model) {
        this.view = view ;
        this.model = model ;
    }
    
}
