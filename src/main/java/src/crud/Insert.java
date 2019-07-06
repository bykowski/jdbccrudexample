package src.crud;

import src.config.DbConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {


    private static String sql =
            "INSERT INTO cars(id, color, prod_year, mark) VALUES (2, 'red', '2000-01-01', 'Fiat 125')";

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
