package book;

import static book.CheckLibrarian.checkLibrarian;
import static book.MenuAccount.menuAccount;
public class Application {
    public static void main(String[] args) {
        checkLibrarian();
        menuAccount();
    }
}
