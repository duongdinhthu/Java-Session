package seasions15;

import edunextS15.TransactionHistory;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public static long balancerNumber = 1000000;
    public static ArrayList<TransactionHistory> listHistory = new ArrayList<>();
    public static long getBalancerNumber(){
        return balancerNumber;
    }
    public static long transfer(long money,String beneficiaryAccount,String messager){
        if (money <50000){
            System.out.println("The transfer amount cannot be less than 50,000");
        }else if (money > balancerNumber){
            System.out.println("The transfer amount cannot be greater than the account balance");
        }else {
            long newBalancerNumber = balancerNumber - money;
            balancerNumber = newBalancerNumber;
            System.out.println("Successful money transfer");
            System.out.println("beneficiary account: " + beneficiaryAccount);
            System.out.println("Number transfer : " + money);
            System.out.println("Messager : " + messager);
        }
        return balancerNumber;

    }
    public void actionTransfer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter beneficiary account number: ");
        String beneficiaryAccount = scanner.nextLine();
        System.out.println("Enter the messager: ");
        String messager = scanner.nextLine();
        System.out.println("Enter the money transfer: ");
        long money = scanner.nextLong();
        transfer(money,beneficiaryAccount,messager);
    }
    public void getHistory(){
        for (TransactionHistory history : listHistory){
            System.out.println(history);
        }
    }
    public static String formatMoney(){
        DecimalFormat formater =new DecimalFormat("###,###,###.0");
        return formater.format(balancerNumber);
    }
}
