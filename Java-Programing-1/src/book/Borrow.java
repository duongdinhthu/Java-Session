package book;

import java.util.LinkedList;
import java.util.Scanner;

import static book.Library.books;

import static book.Member.students;

public class Borrow {
    private String name;
    private String title;

    public Borrow(String name, String title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    static LinkedList<Borrow> borrow = new LinkedList<>();
    public  static void showBorrow(){
        for (Borrow bor : borrow){
            System.out.println(bor);
        }
    }
    public static void borrowBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title borrow: ");

        String title = scanner.nextLine();
        System.out.println("Enter the student name:");
        String name = scanner.nextLine();
        boolean success = true;
        for (Member student : students){
            if (student.getName().equals(name)){
                for (Book book : books) {
                    if (book.getTitle().equals(title) && book.isSuccess()==success) {
                        Borrow add = new Borrow(name,title);
                        borrow.add(add);
                        book.setSuccess(false);
                    }else {
                        System.out.println("The title is wrong or the book has been borrowed!");
                    }
                }
            }
        }

    }
}
