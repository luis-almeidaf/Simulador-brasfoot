package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    public static Connection connect() throws SQLException {
        Connection connection = null;

        try {
            var dbURL = "jdbc:postgresql://localhost/postgres";
            var user = "postgres";
            var pass = "postgres";
            connection = DriverManager.getConnection(dbURL, user, pass);
            if (connection != null) {
                System.out.println("Connected to database");
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();


            }
        }
        return connection;
    }
}

