package book;

import java.util.Scanner;

import static book.Borrow.*;
import static book.Library.*;

import static book.Member.addStudent;
import static book.Member.showStudent;
import static book.Menu.menu;


    public class MenuAccount extends Exception {
        public static void menuAccount(){
            Scanner scanner = new Scanner(System.in);
            try{
                while (true){
                    menu();
                    int chose = scanner.nextInt();
                    switch (chose){
                        case 1:
                            System.out.println("Add book :");
                            addBook();
                            break;
                        case 2:
                            System.out.println("Remove book:");
                            removeBook();
                            break;
                        case 3:
                            System.out.println("Show book");
                            showBook();
                            break;
                        case 4:
                            System.out.println("Search book:");
                            searchBook();
                            break;
                        case 5:
                            System.out.println("Add student");
                            addStudent();
                            break;
                        case 6:
                            System.out.println("Show student");
                            showStudent();
                            break;
                        case 7:
                            System.out.println("Borrow book:");
                            borrowBook();
                            break;
                        case 8:
                            System.out.println("Show borrow book:");
                            showBorrow();
                            break;
                        default:
                            System.out.println("Khong co lua chon nay");
                            break;
                    }
                }
            }catch (Exception e){
                System.out.println("Ban da nhap sai");
            }
        }
    }

