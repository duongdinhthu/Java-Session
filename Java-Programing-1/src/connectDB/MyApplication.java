package connectDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MyApplication {
    private static final String tableName = "customer";

    //goi doi tuong connection

    public static final Connection connection;

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
        statement.executeQuery(query);
}
public static void setStatementUpdate(String query) throws SQLException {
    statement.executeUpdate(query);
}
    public MyApplication() throws SQLException {
    }

    public static void main(String[] args) throws SQLException {
        createCustomer();
        updateCustomer();
        deleteCustomer();
        getAll();
//
    }
    public static void getAll() throws  SQLException{

        // cau lenh truy van ( sql engine)
        String query = "SELECT * FROM "+tableName;
        // thuc thi truy van
        ResultSet rs = statement.executeQuery(query);
        //doc ban ghi tren ResultSet
        while (rs.next()){
            int pid = rs.getInt(1); /// lay cot dau tien
//            int pid1 = rs.getByte("pid");// lay ten cot
            String fname = rs.getString(2);
            String lname = rs.getString(3);
            String email = rs.getString(4);
            System.out.println("===============");
            System.out.println("Customer ID : " + pid);
            System.out.println("First name : " + fname);
            System.out.println("Last name : " + lname);
            System.out.println("Email : " + email);
        }
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
