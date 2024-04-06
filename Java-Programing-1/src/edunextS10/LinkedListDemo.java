package edunextS10;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void demoLinkedList(){
        // khoi tao link List
        LinkedList<String> student = new LinkedList<>();
        //them ds
        student.add("Ngoc");
        student.add("Thu");
        student.add("Tung");
        student.add("Binh");
        student.add("Tuan");
        List<String> animal = new LinkedList<>();
        // ve co ban thi no tuong duong cac phuong thuc trong array list
        //add,set,get,remove , clear
        // poll(): Tra ve phan tu dau tien va xoa khoi danh sach
        student.remove(2);
        show(student);
        System.out.println("-----------------");
        System.out.println(student.indexOf("Tuan"));


    }
    public static void show(LinkedList list){
        for (Object linkedList : list){
            System.out.println(linkedList);
        }
    }

    public static void main(String[] args) {
        demoLinkedList();
    }
}
