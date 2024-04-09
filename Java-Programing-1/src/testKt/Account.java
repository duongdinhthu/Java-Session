package testKt;

import java.util.Scanner;

public class Account {

    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount;
    public Account(){

    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma khach hang :");
        String mkh = scanner.nextLine();

            if(mkh.length()==5){
                    this.customerCode = mkh;
            }else{
                    System.out.println("Ma khach hang khong dung. moi ban nhap lai");
            }
    }
    public long deposit(){
        Scanner scanner = new Scanner(System.in);
        int deposit = scanner.nextInt();
        amount += deposit;
return amount;
    }
    public long withDraw(){
        Scanner scanner = new Scanner(System.in);
        int draw = scanner.nextInt();
        if(amount < draw){
            System.out.println("So tien rut lon hon tai khoan goc. moi ban thu lai");
        }else {
            amount-= draw;
        }
        return amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", accNumber=" + accNumber +
                ", amount=" + amount +
                '}';
    }
}
