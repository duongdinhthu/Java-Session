package connect2;

import java.util.Scanner;

import static connect2.CRUDColumn.deleteColum;


public class DeleteColumn {
    public static void deleteColumn(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the column name delete:");
        String nameColumn = scanner.nextLine();


        System.out.println("Bạn có muốn tiếp tục thực thi không? (y/n)");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("y")) {
            deleteColum(nameColumn);
        } else if (!input.equalsIgnoreCase("n")) {
            System.out.println("Vui lòng chỉ nhập 'y' hoặc 'n'.");
        }

    }
}
