package connect2;

import java.sql.SQLException;

import static connect2.CRUDatabase.getAllColumn;
import static connect2.MenuColumn.menuColumn;
import static connect2.MenuColumn1.menuColumn1;

public class GetColumn {
    public static void getCL() throws SQLException {
        getAllColumn();
        menuColumn();
        menuColumn1();
    }
}
