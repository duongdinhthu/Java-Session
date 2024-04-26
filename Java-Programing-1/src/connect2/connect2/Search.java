package connect2.connect2;

import java.sql.SQLException;
import java.util.Scanner;

import static connect2.CRUDatabase.searchCustomer;

public class Search {
    public static void search() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name Search : ");
        String name = scanner.nextLine();
        searchCustomer(name);
    }
}
