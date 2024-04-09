package ktraJ1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Account account = new Account();
        account.setCustomerCode();
        account.setCustomerName();
        account.setAccNumber();
        account.setAmount();
        System.out.println(account.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn muốn gửi hay rút tiền (gửi/rút): ");
        String action = scanner.nextLine();
        int amount = account.getAmount();
        if (action.equalsIgnoreCase("gửi")) {
            System.out.print("Nhập số tiền gửi: ");
            int type = scanner.nextInt();
            account.deposit(amount, type);
        } else if (action.equalsIgnoreCase("rút")) {
            System.out.print("Nhập số tiền rút: ");
            int type = scanner.nextInt();
            if (type <= amount) {
                account.draw(amount,type);
            } else {
                System.out.println("Số tiền rút vượt quá số dư trong tài khoản.");
            }


        }
        System.out.println(account.toString());
    }
}