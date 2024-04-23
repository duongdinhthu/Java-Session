package connectDB;

import java.sql.*;


public class MyApplication {
    private static final String tableName = "customer";

    //goi doi tuong connection

    public static Connection connection;

    static {
        try {
            connection = MySQLConnectDB.getMySQLConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static final Statement statement;
    //tao statement cau lenh de thuc thi thao tac


    static {
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
public static void setStatementQuery(String query) throws SQLException {
        //hàm eexecuteQuery(query) dùng để đọc
        statement.executeQuery(query);
}
public static void setStatementUpdate(String query) throws SQLException {
        // hàm statement.executeUpdate(query); sử dụng để insert , update , delete ( thay đổi dữ liệu)
    statement.executeUpdate(query);
}
    public MyApplication() throws SQLException {
    }

    public static void main(String[] args) throws SQLException {
////        createCustomer();
//        updateCustomer();
//        deleteCustomer();
        getCustomerVsPreparedStatement();

        getAll();

//
    }
    public static void getCustomerVsPreparedStatement()throws SQLException{
        String query = " select * from customer where customer_id = ? and last_name like ?";
        // tạo đối tượng prepare statement
        PreparedStatement pstm = connection.prepareStatement(query);
        // thiết lạp tham so cho prepare statement
        // thiết lập tham số cho dấu ? đầu tiên
        // 1 là đại diện cho thứ tuwj dấu ?
        pstm.setInt(1,4);
        // thết lập tham số cho dấu ? thứ 2
        pstm.setString(2,"thu");
        // kết quả trả về đi tượng ResultSet
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            System.out.println("=================================");
            System.out.println("Customer ID: " + rs.getInt(1));
            System.out.println("First Name : " + rs.getString("first_name"));
            System.out.println("Last Name  :" + rs.getString(3));
            System.out.println("Email : " + rs.getString("email"));
        }
connection.close();
    }
    public static void getAll() throws  SQLException{

        // cau lenh truy van ( sql engine)
        String query = "SELECT * FROM "+tableName;
        // thuc thi truy van
        ResultSet rs = statement.executeQuery(query);
        //ResultSet chứa keest quả trả về từ csdl
        //doc ban ghi tren ResultSet

        while (rs.next()){
            //đọc customer id có kiểu int
            int pid = rs.getInt(1); /// lay cot dau tien
//            int pid1 = rs.getInt("pid");// lay ten cot
            //đọc first_name có kiu String
            String fname = rs.getString(2);
            String lname = rs.getString(3);
            String email = rs.getString(4);
            System.out.println("===============");
            System.out.println("Customer ID : " + pid);
            System.out.println("First name : " + fname);
            System.out.println("Last name : " + lname);
            System.out.println("Email : " + email);
        }
        //gọi xong ra thì đóng lai
        connection.close();

    }
    public static void createCustomer() throws SQLException {

        String query = "insert into "+tableName+"(customer_id,first_name,last_name,email)values(3,'Hai','nam','gmail@.com');";
        //execute
        setStatementUpdate(query);
    }
    public static void updateCustomer()throws SQLException{
        String query = "update "+tableName+" set first_name ='thu' where customer_id = 2" ;
        setStatementUpdate(query);
    }
    public static void deleteCustomer()throws SQLException{
        String query = "delete from "+tableName+"  where customer_id = 5" ;
        setStatementUpdate(query);
    }
}
