package pl.itacademy.dao;

import pl.itacademy.model.Group;
import pl.itacademy.repository.ConnectionManager;

import javax.sound.sampled.EnumControl;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;

public class GroupDaoImplementation implements  GroupDao {
  private Connection connection;
  private Statement statement;

  public GroupDaoImplementation() throws SQLException, IOException {
    ConnectionManager connectionManager = new ConnectionManager();
    connection=connectionManager.getConnection();
    statement = connection.createStatement();
  }

  @Override
  public Group getByGroupNumber(String groupNumber) throws SQLException {
    String query = "SELECT * FROM groups WHERE group_number='" + groupNumber+"'";
    ResultSet resultSet = statement.executeQuery(query);
    while(resultSet.next()) {
      Group group = new Group();
      ResultSetMetaData metaData = resultSet.getMetaData();

      group.setGroupId(resultSet.getInt(1));
      group.setGroupNumber(groupNumber);
      group.setSubject(resultSet.getString(3));
      group.setStartedYear(LocalDate.ofYearDay(resultSet.getInt(4), 1));

      return group;
    }
    return null;
  }

  @Override
  public Group addGroup(Group group) {
    return null;
  }

}
