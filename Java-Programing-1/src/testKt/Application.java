package testKt;

public class Application {
    public static void main(String[] args) {
        Account account = new Account();
        account.input();
        System.out.println(account.getCustomerCode());
    }
}
