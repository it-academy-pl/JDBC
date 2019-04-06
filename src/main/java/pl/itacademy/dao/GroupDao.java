package pl.itacademy.dao;

import pl.itacademy.model.Group;

public interface GroupDao {
  Group getByGroupNumber(String groupNumber);
  Group addGroup(Group group);
}
