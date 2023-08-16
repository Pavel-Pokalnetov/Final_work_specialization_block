package IOStorage;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class CreateTable {
    public static void run() {
        try {
            DB.connect();
            Connection connection = DB.getConnection();
                Statement statement = connection.createStatement();
                String query = "CREATE TABLE IF NOT EXISTS animals (id UUID PRIMARY KEY, " +
                        "type TEXT, " +
                        "name TEXT, " +
                        "birthday TEXT, " +
                        "command TEXT);";
                statement.execute(query);
            } catch (SQLException e) {
                System.out.println("Ошибка записи в BD");
                e.printStackTrace();
            }
        }
}