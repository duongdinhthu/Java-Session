package mvc.model;

import mvc.entity.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductDAO {
    public void createProduct(Product product) throws SQLException;
    public Product getProductById(int proId) throws SQLException;
    public ArrayList<Product> getAllProduct() throws SQLException;
    public void updateProduct(Product product) throws SQLException;
    public boolean deleteProduct(int proId) throws SQLException;
}
