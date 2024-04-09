package ktraJ1;

import java.util.Scanner;

public class Account  {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private int amount;

    public Account(String customerCode, String customerName, int accNumber, int amount) {
        this.customerCode = customerCode;

        this.customerName = customerName;
        this.accNumber = accNumber;
        this.amount = amount;
    }

    public Account() {
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode() {
        Scanner scanner = new Scanner(System.in);
        String mkh = scanner.nextLine();
        if(mkh.length()==5){
            this.customerCode = mkh;
        }else{
            System.out.println("Ma khach hang khong dung. moi ban nhap lai");
        }
    }

    public String getCustomerName() {

        return customerName;
    }

    public void setCustomerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên KH:");
        String name = scanner.nextLine();
        this.customerName = name;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập số tài khoản (số dương, 6 chữ số, bắt đầu bằng '100'): ");
            long number = scanner.nextLong();
            if (String.valueOf(number).length() == 6 && String.valueOf(number).startsWith("100")) {
                this.accNumber = (int) number;
                break;
            } else {
                System.out.println("Số tài khoản không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount() {
this.amount = 100000;
    }
    public void input(){

    }
    public void deposit(int amount,int type){
        amount  += type;
        this.amount = amount;
    }
public void draw(int amount,int type){
    if (amount >= type) {
        amount -= type;
        System.out.println("Withdrawn $" + type + ". New balance: $" + amount);
        this.amount=amount;
    } else {
        System.out.println("Insufficient funds. Withdrawal failed.");
    }
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
