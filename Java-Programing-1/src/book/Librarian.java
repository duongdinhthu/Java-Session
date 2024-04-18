package book;

public class Librarian {
    private static String username = "username";
    private static String password = "ok";
    public static boolean checkLi(String user, String pass){
        if (username.equals(user)&& password.equals(pass)){
            System.out.println("Success login!");
            return true;
        }else {
            System.out.println("Incorrect username and password, please try again");
            return false;
        }
    }
}
