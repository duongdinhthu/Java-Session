package connect2.connect2;

import java.sql.SQLException;
import java.util.Scanner;

import static connect2.CRUDTable.updateTab;

public class UpdateTable {
    public static void updateTable() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the table name update:");
        String name = scanner.nextLine();
        System.out.println("Enter the new name : ");
        String newName = scanner.nextLine();
        updateTab(name,newName);
    }
}
