package mvc.controller;

import mvc.entity.Product;
import mvc.model.ProductDAO;
import mvc.model.ProductDAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProductController {
    ProductDAO productDAO = new ProductDAOImpl();

    public ProductController() throws SQLException {
    }


    public void creatProductController(Product product) throws SQLException {
        productDAO.createProduct(product);
    }
    public ArrayList<Product> getAllProduct() throws SQLException {
        return productDAO.getAllProduct();
    }
}

