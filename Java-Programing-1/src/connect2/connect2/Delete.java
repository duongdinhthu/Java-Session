package connect2.connect2;

import java.sql.SQLException;
import java.util.Scanner;

import static connect2.CRUDatabase.deleteCustomer;

public class Delete {
    public static void delete() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id delete: ");
        int id = scanner.nextInt();

            deleteCustomer(id);


    }
}
