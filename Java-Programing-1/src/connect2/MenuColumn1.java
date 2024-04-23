package connect2;

import java.util.Scanner;

import static connect2.CRUDatabase.getAll;
import static connect2.Create.create;
import static connect2.Delete.delete;
import static connect2.GetColumn.getCL;
import static connect2.Menu.menuCRUD;
import static connect2.Menu1.menu;
import static connect2.Search.search;
import static connect2.Update.update;

public class MenuColumn1 {
    public static void menuColumn1(){
        System.out.println("Lua chon cua ban : ");
        System.out.println("1.Add column");
        System.out.println("2.Add constrain");
        System.out.println("3.Update column");
        System.out.println("4.Delete column");
        System.out.println("0.Back");
        }
}
