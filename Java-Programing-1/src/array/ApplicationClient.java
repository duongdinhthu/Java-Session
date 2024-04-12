package array;

import java.util.Scanner;

public class ApplicationClient {
    public static void main(String[] args) {
        Array array = new Array();
        System.out.println("Ban muon luu bao nhieu pan tu mang: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int intArray[] = new int[size];
        // truyen mang tao vao ham create array
        array.createArray(intArray);
        array.showArray(intArray);

    }
}
