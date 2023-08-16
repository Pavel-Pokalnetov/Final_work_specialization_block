package IOStorage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private static Connection connection;
    private static boolean state = false;

    public static void connect(){
        if (state) {
            System.out.println("Уже подключено");
            return;
        }
        try{
            connection = DriverManager.getConnection("jdbc:sqlite:data.db");
            state = true;
        }catch (SQLException e){
            System.out.println("Проблема при подключении к базе данных");
            e.printStackTrace();
        }

    }

    public static void disconnect(){
        if (!state) return;
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                state = false;
            }
        } catch (SQLException e) {
            System.out.println("Проблема при отключении от базы данных");
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return connection;
    }

    public static boolean getState(){
        return state;
    }
}
