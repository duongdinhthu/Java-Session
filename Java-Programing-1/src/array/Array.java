package array;

import java.util.Scanner;

public class Array {
    Scanner scanner = new Scanner(System.in);
    public void createArray(int arr[]){

        for (int i = 0; i<arr.length;i++){

            System.out.println("Nhap vao tung gia tri cho phan tu " + i +" :" );
            int a = scanner.nextInt();
            arr[i] = a;
        }
    }
    public void showArray(int arr[]){
        for (int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i] +"\t" +"\t");
        }
    }
}
