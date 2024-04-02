package exception;

import java.io.IOException;
import java.sql.SQLDataException;
import java.util.Scanner;

public class ThrowsDemo {
    public static int inputAge() throws Exception,IOException,ArithmeticException, SQLDataException {//io exception la check ngoai le nhap xuat
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int age =scanner.nextInt();
        if (age<=0) throw new SQLDataException("Tuoi khong duoc nho hon 0");
        return age;
    }
    public static void getAge(){
        try{
            int age = inputAge();
            System.out.println("Tuoi vua nhap:" + age);
        }catch (Exception e){
            System.out.println("Tuoi khong phu hop");
        }
    }

}

// tai day chuong trinh khong muon su dung try-catch de xu ly ma ta se day trach nhiem cho phuong thuc khac

