package MVCLogin.controller;

import MVCLogin.model.LoginDAO;
import MVCLogin.model.LoginDaoImpl;
import MVCLogin.entity.Users;

public class LoginController {
    LoginDAO loginDAO = new LoginDaoImpl();
    // step 1
    public String loginStatementController(Users user){
        // step 2
        String message = loginDAO.checkLoginStatement(user);
        // step 3
        return  message;
    }
    public String loginPrepareController(Users user){
        return loginDAO.checkLoginPrepareStatement(user);
    }
}
