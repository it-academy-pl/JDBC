package pl.itacademy.dao;

import pl.itacademy.model.Group;

import java.io.IOException;
import java.sql.SQLException;

public interface GroupDao {
  Group getByGroupNumber(String groupNumber) throws SQLException;
  Group addGroup(Group group) throws SQLException;
}
