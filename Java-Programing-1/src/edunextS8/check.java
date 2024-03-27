package edunextS8;
import java.util.Scanner;
public class check {

    /**
     * Constructor for objects of class Client
     */
    public check() {
        // To do:
    }

    public static void main(String[] args) {
        int i, n = 2;
        int a[] = new int[n];
        Scanner input = new Scanner(System.in);
        //Declare Scanner Object named input

        for (i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            try {
                a[i] = input.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Nhập không phải số nguyên. Vui lòng nhập lại.");
                input.next(); // Đọc và bỏ qua giá trị không phải số nguyên
                i--; // Quay lại vị trí trước đó để nhập lại
            }
        }
    }
}
