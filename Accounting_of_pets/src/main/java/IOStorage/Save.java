package IOStorage;

import AppTools.MainAnimalsBook;
import BaseClasses.Animal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Save implements Runnable {
    MainAnimalsBook animalsBook;
    public Save(MainAnimalsBook animalsBook) {
        this.animalsBook = animalsBook;
    }

    @Override
    public void run() {
        if (!DB.getState()){
            System.out.println("Нет соединения с базой\nданные не сохранены");
            return;
        }
        try {
            DB.connect();
            Connection connection = DB.getConnection();
            String sql = "INSERT INTO users (id,type,name,birthday,command) VALUES (?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            for(Animal animal: animalsBook.getMainlist() ) {
                statement.setString(1, animal.getId().toString());
                statement.setString(2, animal.getType());
                statement.setString(3, animal.getName());
                statement.setString(4, animal.getBirthday());
                statement.setString(5, animal.getCommandTXT());
                statement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        DB.disconnect();
    }
}

