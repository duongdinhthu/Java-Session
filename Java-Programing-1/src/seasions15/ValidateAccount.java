package seasions15;

public class ValidateAccount {
    public final String MOBILE = "000";
    public final String PASSWORD = "ok";
    public boolean checkAccount(String mobile,String password){
        if(mobile.equals(MOBILE)&& password.equals(PASSWORD)){
            System.out.println("Success Login!");
            return true;
        }else {
            System.out.println("Unsuccess login . Please check again!");
            return false;
        }
    }

    public ValidateAccount() {
    }
}
