package seasions15;

import java.util.InputMismatchException;
import java.util.Scanner;

import static edunextS15.Format.formatMoney;
import static seasions15.Controller.getBalancerNumber;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidateAccount validateAccount = new ValidateAccount();
        Controller controller = new Controller();
        boolean isCheck = false;
        while (!isCheck){

            System.out.println("Enter the mobile: ");
            String mobile = scanner.nextLine();
            System.out.println("Enter the password: ");
            String password = scanner.nextLine();
            isCheck = validateAccount.checkAccount(mobile,password);
        }
            boolean a = true;
           while (a){
               try {
               menu();
               int chose = scanner.nextInt();
               switch (chose){
                   case 1:
                       System.out.println("Account balance: ");
                       long balance = getBalancerNumber();
                       System.out.println(formatMoney(balance));
                       break;
                   case 2:
                       controller.actionTransfer();
                       break;
                   case 3:
                       System.out.println("Lich su giao dich");
                       controller.getHistory();
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
                   System.out.println("Re enter choice: " + e.getMessage());
                   a = true;
               }
       }
    }
    public static  void menu(){
            System.out.println("your choice : ");
            System.out.println("1.See Account Number  ");
            System.out.println("2.Transfer");
            System.out.println("3.Transaction history");
            System.out.println("0.Thoat");

    }
}
