import Connection.Db;

import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        try (var connection = Db.connect()){
            System.out.println("Connect to postgres");

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
