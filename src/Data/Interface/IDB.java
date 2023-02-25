package Data.Interface;

import java.sql.*;

public interface IDB {
    public Connection getConnection() throws SQLException, ClassNotFoundException;
}
