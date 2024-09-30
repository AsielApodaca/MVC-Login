package com.mycompany.pruebamvc;

import controller.LoginController;
import model.LoginModel;
import view.LoginView;

/**
 *
 * @author Oliver Inzunza, Hisamy Cinco, Gael Castro, Asiel Apodaca
 */
public class PruebaMVC {

    public static void main(String[] args) {
        LoginModel model = new LoginModel() ;
        LoginView view = new LoginView(model) ;
        LoginController controller = new LoginController(view, model) ;
        
        view.setVisible(true) ;
    }
}
