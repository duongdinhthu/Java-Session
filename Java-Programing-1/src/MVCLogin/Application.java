package MVCLogin;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        LoginConsoleUI loginConsoleUI = new LoginConsoleUI();
        loginConsoleUI.start();
    }
}
