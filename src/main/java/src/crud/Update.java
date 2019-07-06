package src.crud;

import src.config.DbConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

    private static String sql =
            "UPDATE cars SET id=2, color='black', prod_year='1991-03-03', mark='polonez fso' WHERE cars.color like 'red'";

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
