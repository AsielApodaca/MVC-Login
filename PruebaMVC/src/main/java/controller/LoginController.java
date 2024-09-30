/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.LoginModel;
import view.LoginView;

/**
 *
 * @author Oliver Inzunza, Hisamy Cinco, Gael Castro, Asiel Apodaca
 */
public class LoginController {

    private LoginView view;
    private LoginModel model;

    public LoginController(LoginView view, LoginModel model) {
        this.view = view;
        this.model = model;

        this.view.addLoginListener(new LoginListener());
    }

    class LoginListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String username = view.getUsername();
            String password = view.getPassword();

            model.setUser(username);
            model.setPassword(password);

            if (model.validateCredentials()) {
                view.showMessage("Login successful!");
            } else {
                view.showMessage("Invalid username or password");
            }
        }
    }

}
