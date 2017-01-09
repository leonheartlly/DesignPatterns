package factoryDesign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Design Pattern focused on create an object.(a connection one in this case)
 * 
 * @author lucas
 *
 */
public class ConnectionFactory {

    private static final String USER = "root";
    private static final String PWD = "123";
    private static final String CONNECTION = "//localhost...";
    private static final String JDBC = "jdbc:mysql";

    /**
     * Generate a database connection.
     * 
     * @return
     */
    public Connection getConnection() {
        Connection c;
        try {
            c = DriverManager.getConnection(JDBC + CONNECTION, USER, PWD);

            return c;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
