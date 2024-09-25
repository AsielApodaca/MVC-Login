/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebamvc;

import controller.LoginController;
import model.LoginModel;
import view.LoginView;

/**
 *
 * @author olive
 */
public class PruebaMVC {

    public static void main(String[] args) {
        LoginModel model = new LoginModel() ;
        LoginView view = new LoginView(model) ;
        LoginController controller = new LoginController(view, model) ;
        
        view.setVisible(true) ;
    }
}
