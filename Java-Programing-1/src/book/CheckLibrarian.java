package book;

import java.util.Scanner;

import static book.Librarian.checkLi;

public class CheckLibrarian {
    public static boolean checkLibrarian(){
        Scanner scanner = new Scanner(System.in);
        boolean isCheck = false;
        while (!isCheck){
            System.out.println("Enter the user");
            String user = scanner.nextLine();
            System.out.println("Enter the password");
            String pass = scanner.nextLine();
            isCheck = checkLi(user,pass);
        }
        return isCheck;
    }
}
