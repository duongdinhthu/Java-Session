package mvc.view;

import mvc.controller.ProductController;
import mvc.entity.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleUI {
    public static ProductController productController;

    static {
        try {
            productController = new ProductController();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Product product = new Product();
    public static void menu(){

        System.out.println("Ban muon lam gi ?");
        System.out.println("1.Read");
        System.out.println("2.Create");
        System.out.println("3.Update");
        System.out.println("4.Delete");
        System.out.println("5.Search");
    }
    private static void create() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the new product ID:");
        int id = scanner.nextInt();
        scanner.nextLine();
        product.setProductId(id);
        System.out.println("Enter the new product name:");
        String name = scanner.nextLine();
        product.setProductName(name);
        System.out.println("Enter the new product Description:");
        String desc = scanner.nextLine();
        product.setProductDesc(desc);
        System.out.println("Enter the new product Price:");
        Double price = scanner.nextDouble();
        product.setPrice(price);
        productController.creatProductController(product);

    }
    private static void getAll() throws SQLException {
        //step 4
        ArrayList<Product> allProduct = productController.getAllProduct();
        allProduct.forEach((product) ->
                        System.out.println(product.getProductId()+"\n" + product.getProductName())
                );
    }
    public static void start() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        menu();
        int choice = scanner.nextInt();
        switch (choice){
            case 2:
                System.out.println("Create");
                create();
                break;
            case 1:
                System.out.println("Get all");
                getAll();
                break;
        }

    }
}
