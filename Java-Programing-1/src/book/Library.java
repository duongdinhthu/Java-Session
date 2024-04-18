package book;


import java.util.LinkedList;
import java.util.Scanner;

public class Library {
    Book get = new Book();
    static LinkedList<Book> books = new LinkedList<>();

    public static void addBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Id:");
        String id = scanner.nextLine();
        System.out.println("Enter the title");
        String title = scanner.nextLine();
        System.out.println("Enter the author: ");
        String author = scanner.nextLine();
        System.out.println("Enter the publisher: ");
        String publisher = scanner.nextLine();
        System.out.println("Enter the year: ");
        String year = scanner.nextLine();
        System.out.println("Enter the available : ");
        String available = scanner.nextLine();
        boolean success = true;
        Book add = new Book(id,title,author,publisher,year,available,true);
        books.add(add);
    }
    public static void removeBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the book id to remove: ");
        String id = scanner.nextLine();
        // Sử dụng phương thức removeIf() để xoá các phần tử thỏa mãn điều kiện
        books.removeIf(book -> book.getId().equals(id));
    }
    public static void showBook(){
        for (Book book : books){
            System.out.println(book);
        }
    }
    public static void searchBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the search title: ");
        String title = scanner.nextLine();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println(book);
            }
        }
    }

}
