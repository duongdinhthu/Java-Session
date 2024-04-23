package connect2;

import java.sql.SQLException;
import java.util.Scanner;

import static connect2.CRUDatabase.*;
import static connect2.Create.create;
import static connect2.CreateTable.createTable;
import static connect2.Delete.delete;
import static connect2.DeleteTable.deleteTable;
import static connect2.GetColumn.getCL;
import static connect2.Menu1.menu;
import static connect2.Search.search;
import static connect2.Update.update;
public class Menu {
    public static void menuCRUD() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
            while (!exit){
                menu();
                int chose = scanner.nextInt();
                try {
                    switch (chose) {
                        case 1:
                            System.out.println("Read");
                            getAll();
                            break;
                        case 2:
                            System.out.println("Create");
                            create();
                            break;
                        case 3:
                            System.out.println("Update");
                            update();
                            break;
                        case 4:
                            System.out.println("Delete");
                            delete();
                            break;
                        case 5:
                            System.out.println("Search");
                            search();
                            break;
                        case 6:
                            System.out.println("Read all column");
                            getCL();
                            exit = true;
                            break;
                        case 7:
                            System.out.println("Remove Table");
                            deleteTable();
                            break;
                        case 8:
                            System.out.println("Create Table");
                            createTable();
                            break;

                        case 0:
                            scanner.close();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Khong co lua chon nay");
                            break;
                    }
                }catch (Exception e){
                    System.out.println("da bi loi!");
                }
            }
    }
}
