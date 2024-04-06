package exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDemo {
    public static void createArray(){
        Scanner sc = new Scanner(System.in);
        int size = 0;
        // neu nhap du lieu nho hon hoac bang 0 thi nhap lai
        while (size >=0){
            boolean check = false;
            while (!check)// vong lap while de lap khi nhay vao khoi catch
                try {
                    System.out.println("Nhap vao so luong cac phan tu mang: ");
                    size = Integer.parseInt(sc.nextLine());
                    check = true;
            }catch (NumberFormatException e){
                    System.out.println("Nhap sai dinh dang, vui long nhap lai");
                }catch (ArithmeticException sql){
                    System.out.println("Arimathic");
                }catch (OutOfMemoryError io){
                    System.out.println("memoty");
                }catch (InputMismatchException input){
                    System.out.println("input");
                }


        }
    }
}
