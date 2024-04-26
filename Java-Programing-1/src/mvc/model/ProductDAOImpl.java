package mvc.model;

import mvc.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static connect2.CRUDatabase.openConnection;

public class ProductDAOImpl implements ProductDAO{
    private final Connection connection = openConnection();
    private final String SQL_CREATE_PRODUCT = "insert into products values(?,?,?,?)";
    private final String SQL_GET_PRODUCT_BY_ID = "select * from products where product_id = ?";
    private final String SQL_GET_ALL_PRODUCT = "select * from products";
    private final String SQL_UPDATE_PRODUCT = "update products set product_name like ?,description = ?,price = ? where product_id = ?";
    private final String SQL_DELETE_PRODUCT = "delete from products where product_id = ?";

    public ProductDAOImpl() throws SQLException {
    }


    @Override
    public void createProduct(Product product) throws SQLException {
        PreparedStatement pstm = connection.prepareStatement(SQL_CREATE_PRODUCT);
        pstm.setInt(1,product.getProductId());
        pstm.setString(2,product.getProductName());
        pstm.setString(3,product.getProductDesc());
        pstm.setDouble(4,product.getPrice());
        pstm.executeUpdate();


    }

    @Override
    public Product getProductById(int proId) throws SQLException {
        Product product= new Product();
        PreparedStatement pstm = connection.prepareStatement(SQL_GET_PRODUCT_BY_ID);
        pstm.setInt(1,proId);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            System.out.println("id:" + rs.getInt(1));
            System.out.println("name:" + rs.getString(2));
            System.out.println("desc:" + rs.getString(3));
            System.out.println("price :" + rs.getString(4));
        }
        return product;
    }

    @Override
    public ArrayList<Product> getAllProduct() throws SQLException {
        ArrayList<Product> allProducts = new ArrayList<>();
        PreparedStatement pstm = connection.prepareStatement(SQL_GET_ALL_PRODUCT);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            Product product = new Product();
            product.setProductId(rs.getInt(1));
            product.setProductName(rs.getString(2));
            product.setProductDesc(rs.getString(3));
            product.setPrice(rs.getDouble(4));
            allProducts.add(product);

        }
        return allProducts;
    }

    @Override
    public void updateProduct(Product product) throws SQLException {
        PreparedStatement pstm = connection.prepareStatement(SQL_UPDATE_PRODUCT);
        pstm.setInt(4,product.getProductId());
        pstm.setString(1,product.getProductName());
        pstm.setString(2,product.getProductDesc());
        pstm.setDouble(3,product.getPrice());
        pstm.executeUpdate();

    }

    @Override
    public boolean deleteProduct(int proId) throws SQLException {
        PreparedStatement pstm = connection.prepareStatement(SQL_DELETE_PRODUCT);
        pstm.setInt(1, proId); // Truyền giá trị proId vào câu lệnh SQL
        int rowsAffected = pstm.executeUpdate(); // Thực hiện xóa sản phẩm và lấy số dòng bị ảnh hưởng

        // Kiểm tra nếu có dòng nào bị ảnh hưởng, tức là sản phẩm đã được xóa thành công
        if (rowsAffected > 0) {
            return true;
        } else {
            return false;
        }
    }
}
