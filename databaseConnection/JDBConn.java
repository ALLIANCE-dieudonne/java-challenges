package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBConn {
  public static void main(String[] args) {

    String url = "jdbc:mysql://localhost:3306/departments";
    String username = "root";
    String password = "fils1?";
    try {
      //initialize the driver class
      Class.forName("com.mysql.cj.jdbc.Driver");

      //creating the connection
      Connection connection = DriverManager.getConnection(url, username, password);

      //creating the statement object
      Statement statement = connection.createStatement();

      //executing query
      ResultSet resultSet = statement.executeQuery("select * from department");

      while (resultSet.next()) {
        System.out.println(resultSet.getString(2));
      }

      connection.close();

    } catch (Exception e) {
      System.out.println(e);
    }

  }

}
