package connect2;

import java.util.Scanner;

import static connect2.AddColumn.addColumn;

import static connect2.Create.create;

import static connect2.DeleteColumn.deleteColumn;
import static connect2.Menu.menuCRUD;
import static connect2.MenuColumn1.menuColumn1;

import static connect2.UpdateColumn.updateColumn;

public class MenuColumn {
    public static void menuColumn(){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit){
            menuColumn1();
            int chose = scanner.nextInt();
            try{
                switch (chose) {
                    case 1:
                        System.out.println("Read");
                        addColumn();
                        break;
                    case 2:
                        System.out.println("Create");
                        create();
                        break;
                    case 3:
                        System.out.println("Update");
                        updateColumn();
                        break;
                    case 4:
                        System.out.println("Delete");
                        deleteColumn();
                        break;
                    case 0:
                        menuCRUD();
                        exit = true;
                        break;
                    default:
                        System.out.println("Khong co lua chon nay");
                        break;
                }
            }catch (Exception e){
                System.out.println("Moi nhap lai!");
            }
        }
    }
}
