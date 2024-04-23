package connect2;

import java.sql.SQLException;

import static connect2.CRUDatabase.tableDB;

public class CRUDColumn extends CRUDatabase{
    public static void createColumn(String newColumn,String dataType,String numberCharacter) throws SQLException {
        String query = "alter table " + tableDB + " add " + newColumn + " " + dataType + "(" + numberCharacter + ")";
        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void updateColum(String nameColumn,String newName,String dataType,String numberCharacter) throws SQLException {
        String query = "ALTER TABLE " + tableDB + " CHANGE COLUMN " + nameColumn + " " + newName + " " + dataType + "(" + numberCharacter + ")";        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void deleteColum(String nameColumn){
        String query = "ALTER TABLE " + tableDB + " DROP COLUMN " + nameColumn;
        try {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
