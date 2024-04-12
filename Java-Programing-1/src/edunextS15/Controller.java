package edunextS15;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static long balanceNumber = 1000000;
    List<TransactionHistory> listHistory = new ArrayList<TransactionHistory>();
    public long getBalanceNumber(){
        return balanceNumber;
    }
    public static long transfer(long money){
        // kiem tra so tien neu so tien nho hon 50k thi thong bao so tien toi thieu phari chuyen
        // la 50 k
        // neu so tien chuyen lon hon so du thi thong bao tai khoan k du
        // neu chuyen thanh cong , thi thong bao chuyen khoan thanh cong,in ra so du moi va lich su giao dich
        return balanceNumber;
    }
    public void actionTransfer(){
        // thuc hien cac cong viec nhap so tai khoan thu huong,so tien mo ta tai day
    }
    public void getHistory(){
        // in danh sach lich su giao dich
    }
    // dinh dang so tien theo minh mong muon
    public static String formatMoney(long money){
        DecimalFormat formater = new DecimalFormat("###,###,###0.00");
        // 100000 -> 100,000.00
        return formater.format(money);
    }

}
