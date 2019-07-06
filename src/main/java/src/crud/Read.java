package src.crud;

import src.config.DbConfig;
import src.model.Car;

import java.sql.*;

public class Read {


    private static String sql =
            "SELECT id, color, mark, prod_year FROM cars";

    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(
                DbConfig.INSTANCE.getUrl(),
                DbConfig.INSTANCE.getLogin(),
                DbConfig.INSTANCE.getPassword());
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next())
            {
                Car car = new Car(
                        resultSet.getLong("id"),
                        resultSet.getString("color"),
                        resultSet.getDate("prod_year"),
                        resultSet.getString("mark"));
                System.out.println(car);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
