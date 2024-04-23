package connect2;

import java.sql.SQLException;
import java.util.ArrayList;

public class CRUDTable extends CRUDatabase {
    public static void deleteTaB(String deleteNameTB) throws SQLException {
        openConnection();
        String query = "DROP TABLE " + deleteNameTB;
        setStatementUpdate(query);
        closeConnection();
    }
    public static void createTab(ArrayList<String> listColumn,String name) throws SQLException {
        openConnection();
        StringBuilder createTableQuery = new StringBuilder("CREATE TABLE " + name + " (");
        for (String column : listColumn) {
            createTableQuery.append(column).append(" VARCHAR(255), "); // Mặc định kiểu dữ liệu là VARCHAR(255)
        }
        createTableQuery.delete(createTableQuery.length() - 2, createTableQuery.length()); // Xóa dấu phẩy cuối cùng
        createTableQuery.append(");");
closeConnection();
    }

}
