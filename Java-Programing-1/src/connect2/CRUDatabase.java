package connect2;

import connectDB.MySQLConnectDB;

import java.sql.*;

public class CRUDatabase {

    public static final String tableDB = "customer";
    public static Connection connection;
    public static Statement statement;

    static {
        try {
            connection = MySQLConnectDB.getMySQLConnection();
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setStatementUpdate(String query) throws SQLException {
        statement.executeUpdate(query);
    }

    public static void createCustomer(String id, String fname, String lname, String email) throws SQLException {
        String query = "insert into " + tableDB + "(customer_id, first_name, last_name, email) values ('" + id + "', '" + fname + "', '" + lname + "', '" + email + "');";
        setStatementUpdate(query);
    }

    public static void updateCustomer(String id, String newID, String newFName, String newLName, String newEmail) throws SQLException {
        String query = "update " + tableDB + " set first_name = '" + newFName + "', customer_id = '" + newID + "', last_name = '" + newLName + "', email = '" + newEmail + "' where customer_id = '" + id + "'";
        setStatementUpdate(query);
    }

    public static void deleteCustomer(int id) throws SQLException {
        String query = "delete from " + tableDB + " where customer_id = " + id;
        setStatementUpdate(query);
    }
    public static void searchCustomer(String id) throws  SQLException{
        String query = "select * from " + tableDB + " where customer_id = " +id;
        ResultSet rs = statement.executeQuery(query);

        if (rs.getRow() > 0){
            while (rs.next()) {
                int pid = rs.getInt("customer_id");
                String fname = rs.getString("first_name");
                String lname = rs.getString("last_name");
                String email = rs.getString("email");

                System.out.println("===============");
                System.out.println("Customer ID : " + pid);
                System.out.println("First name : " + fname);
                System.out.println("Last name : " + lname);
                System.out.println("Email : " + email);
            }
        }else {
            System.out.println("Khong co phan tu nao co id = " + id);
        }
    }
    public static void getAll() throws SQLException {
        String query = "SELECT * FROM " + tableDB;
        ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                if (rs.getRow() > 0){
                    int pid = rs.getInt("customer_id");
                    String fname = rs.getString("first_name");
                    String lname = rs.getString("last_name");
                    String email = rs.getString("email");

                    System.out.println("===============");
                    System.out.println("Customer ID : " + pid);
                    System.out.println("First name : " + fname);
                    System.out.println("Last name : " + lname);
                    System.out.println("Email : " + email);

                }else {
                    System.out.println("ok");
                }
            }


    }
    public static void getAllColumn()throws SQLException{
        ResultSet rs = statement.executeQuery("SELECT * FROM " + tableDB);

        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        System.out.println("Tên các cột trong bảng:");

        for (int i = 1; i <= columnCount; i++) {
            String columnName = rsmd.getColumnName(i);
            System.out.println("Column " + i + ": " + columnName);
        }
        System.out.println("====================");
    }

    public static void closeConnection() throws SQLException {
        statement.close();
        connection.close();
    }
}