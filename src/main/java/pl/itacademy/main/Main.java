package pl.itacademy.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import pl.itacademy.repository.ConnectionManager;

public class Main {

    public static void main(String[] args) throws SQLException, IOException {



//        ConnectionManager connectionManager = new ConnectionManager();
//        Connection connection = connectionManager.getConnection();
//
//        Statement statement = connection.createStatement();
//        String query = "SELECT * FROM students";
//        ResultSet resultSet = statement.executeQuery(query);
//
//        ResultSetMetaData metaData = resultSet.getMetaData();
//
//        while(resultSet.next()) {
//            if(metaData.getColumnType(1) == Types.BIGINT) {
//                int studentId = resultSet.getInt("student_id");
//                System.out.print(studentId + " ");
//            }
//
//            String firstName = resultSet.getString(3);
//            System.out.print(firstName + " ");
//            String lastName = resultSet.getString(4);
//            System.out.println(lastName);
//        }

//        try {
//            connection.setAutoCommit(false);
//            String insertQuery = "insert into students (group_id, first_name, last_name,"
//                + " email, password) values (?, ?, ?, ?, ?);";
//            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
//            preparedStatement.setInt(1, 1);
//            preparedStatement.setString(2, "Oleg");
//            preparedStatement.setString(3, "Sereda");
//            preparedStatement.setString(4, "1121@test.com");
//            preparedStatement.setString(5, "T0p$3creT!");
//            //preparedStatement.executeUpdate();
//            preparedStatement.addBatch();
//
//            preparedStatement.setInt(1, 1);
//            preparedStatement.setString(2, "Oleg2");
//            preparedStatement.setString(3, "Sereda2");
//            preparedStatement.setString(4, "113@test.com");
//            preparedStatement.setString(5, "T0p$3creT!");
//            preparedStatement.addBatch();
//
//            preparedStatement.executeBatch();
//
//            connection.commit();
//        } catch (SQLException e) {
//            System.out.println(e.getErrorCode());
//            System.out.println(e.getSQLState());
//            System.out.println(e.getMessage());
//            System.out.println(e.getLocalizedMessage());
//            connection.rollback();
//        }
    }
}
