package edunextS15;

import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller extends IOException{
    public static long balanceNumber = 1000000;

    static List<TransactionHistory> listHistory = new ArrayList<TransactionHistory>();
    public static long getBalanceNumber(){
        return balanceNumber;
    }
    public static long transfer(String description,String beneficiaryAccount, long money,LocalDate day){
        if (money < 50000){
            System.out.println("So tien chuyen khong duoc nho hon 50k");
        }else if (money > balanceNumber){
            System.out.println("So tien chuyen lon hon so du cua tai khoan");
        }else {
            long bank = balanceNumber - money;
            balanceNumber = bank;

            System.out.println("Chuyen tien thanh cong!");
            System.out.println("Ban da chuyen so tien " + money + " thanh cong !!");
            System.out.println("So tien con lai cua tai khoan la :" + balanceNumber);
            TransactionHistory  newTransaction = new TransactionHistory(description,beneficiaryAccount,money,day);
            listHistory.add(newTransaction);
        }
        // kiem tra so tien neu so tien nho hon 50k thi thong bao so tien toi thieu phai chuyen
        // la 50 k
        // neu so tien chuyen lon hon so du thi thong bao tai khoan k du
        // neu chuyen thanh cong , thi thong bao chuyen khoan thanh cong,in ra so du moi va lich su giao dich
        return balanceNumber;
    }
    public void actionTransfer(){
        try{
            Scanner scanner = new Scanner(System.in);
            // thuc hien cac cong viec nhap so tai khoan thu huong,so tien mo ta tai day
            System.out.println("Nhap so tai khoan thu huong: ");
            String bankAccount = scanner.nextLine();
            System.out.println("Loi nhan: ");
            String description = scanner.nextLine();
            System.out.println("Nhap so tien can chuyen: ");
            long money = scanner.nextLong();
            LocalDate date = LocalDate.now();
            transfer(description,bankAccount,money,date);
        }catch (Exception e){
            System.out.println("ban da nhap sai , vui long nhap lai");
        }
    }
    public void getHistory(){
        // in danh sach lich su giao dich
        for (TransactionHistory s : listHistory){
            System.out.println(s);
        }
    }
    // dinh dang so tien theo minh mong muon
    public static String formatMoney(long money){
        DecimalFormat formater = new DecimalFormat("###,###,###.00");
        // 100000 -> 100,000.00
        return formater.format(money);
    }
}
