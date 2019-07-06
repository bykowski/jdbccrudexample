package src.crud;

import src.config.DbConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

    private static String sql = "DELETE FROM cars WHERE cars.id > 1";

    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(
                DbConfig.INSTANCE.getUrl(),
                DbConfig.INSTANCE.getLogin(),
                DbConfig.INSTANCE.getPassword());
             Statement statement = connection.createStatement();) {
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


