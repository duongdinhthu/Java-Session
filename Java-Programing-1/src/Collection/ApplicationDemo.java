package Collection;

import java.util.Scanner;

public class ApplicationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntergerArrayDemo intergerArrayDemo = new IntergerArrayDemo();
        System.out.println("How many element of array: ");
        int size = sc.nextInt();
        int intArray[] = new int[size];
        // pass an array to function
        intergerArrayDemo.createArray(intArray);
        //show
        intergerArrayDemo.show(intArray);
        // truoc khi sap xep
        System.out.println();
        System.out.println("Length of array: " + intArray.length);
        System.out.println("Value of index 3: " + intArray[3]);
        intergerArrayDemo.ascSort(intArray);
        //sau khi sap xep
        intergerArrayDemo.show(intArray);
        System.out.println();
//stringArrayDemo();
        //sort desc
        intergerArrayDemo.descSort(intArray);
        intergerArrayDemo.show(intArray);
        System.out.println();
        intergerArrayDemo.insertionSort(intArray);
        intergerArrayDemo.show(intArray);
        System.out.println();
        intergerArrayDemo.sort(intArray);
        intergerArrayDemo.show(intArray);
    }
//    static void stringArrayDemo(){
//        String stringArray[] = new String[5];
//        stringArray[0] = " Thu";
//        stringArray[1] = " Vu";
//        stringArray[2] = " Thao";
//        stringArray[3] = " Thinh";
//        stringArray[4] = " Thoa";
//        for (int i = 0; i < stringArray.length;i++){
//            System.out.println("String array at "+ i + ": "+ stringArray[i]);
//        }

//    }
}
