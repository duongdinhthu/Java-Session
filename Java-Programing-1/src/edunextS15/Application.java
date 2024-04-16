package edunextS15;

import java.util.Scanner;

import static edunextS15.ActionTransfer.actionTransfer;
import static edunextS15.Format.formatMoney;
import static edunextS15.GetHistory.getHistory;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidateAccount validate = new ValidateAccount();
        Controller controller = new Controller();
        boolean isCheck = false;
        while (!isCheck){
            System.out.println("Nhap so dien thoai");
            String mobile = scanner.nextLine();
            System.out.println("Nhap mat khau");
            String password = scanner.nextLine();
            isCheck = validate.checkAccount(mobile,password);
        }
        while (true){
            menu();
            int chose = scanner.nextInt();
            switch (chose){
                case 1:
                    System.out.println("So du");
                    long balance = controller.getBalanceNumber();
                    System.out.println(formatMoney(balance));
                    break;
                case 2:
                    actionTransfer();
                    break;
                case 3:
                    System.out.println("Lich su giao dich");
                    getHistory();
                    break;
                case 0:
                        scanner.close();
                        System.exit(0);
                        break;
                default:
                    System.out.println("Khong co lua chon nay");
                    break;
            }
        }

    }
    public static  void menu(){
        System.out.println("Lua chon cua ban : ");
        System.out.println("1.Xem so du cua ban  ");
        System.out.println("2.Chuyen khoan");
        System.out.println("3.Xem lich su giao dich");
        System.out.println("0.Thoat");
    }
}
