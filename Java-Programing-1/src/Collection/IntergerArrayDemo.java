package Collection;

import java.util.Scanner;

public class IntergerArrayDemo {
    Scanner scanner = new Scanner(System.in);
    // input element fo array
    public void createArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.println("Nhap phan tu tai " + i + ": ");
            arr[i]=scanner.nextInt();
        }
    }
    // out put array
    public void show(int arr[]){ // mot mang int
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    //sort asc
    public void ascSort(int arr[]){
for(int i = 0 ; i<arr.length - 1;i++){
    for(int j = arr.length-i-1;j>0;j--){
        if(arr[j]>arr[j-1]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
        }
    }
}
    }
    public void sort(int arr[]){
        int i = 0;
        int j =arr.length-1;
        while (i<=0){
            while (arr[i]>arr[j]){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                if (i==j-1&&arr[j-1]<arr[j]){
                    j--;
                    break;
                }
            }
            i++;
            if(i==j){
                break;
            }
        }
    }
    //sort desc
    public void descSort(int arr[]){
for(int i = 0; i<arr.length-1;i++){
    for(int j = 0;j<arr.length - i - 1;j++){
        if (arr[j]<arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}

    }
    public void insertionSort(int arr[]){
        for (int i = 1; i< arr.length;i++){
            int key = arr[i];
            int j = i -1;
            while (j>=0&&arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}
