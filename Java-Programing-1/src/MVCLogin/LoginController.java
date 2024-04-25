package MVCLogin;

public class LoginController {
    LoginDAO loginDAO = new LoginDaoImpl();
    // step 1
    public String loginStatementController(Users user){
        // step 2
        return loginDAO.checkLoginStatement(user);
    }
    public String loginPrepareController(Users user){
        return loginDAO.checkLginPrepareStatement(user);
    }
}
