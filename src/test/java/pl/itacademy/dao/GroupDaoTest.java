package pl.itacademy.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.itacademy.model.Group;
import pl.itacademy.repository.ConnectionManager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class GroupDaoTest {
    @Test
    public void connectionOK() {
        assertDoesNotThrow(() -> {
            new GroupDaoImplementation();
        });

    }
    @Test
    public void noGroupByNumber() throws SQLException, IOException {
        GroupDaoImplementation groupDaoImplementation = new GroupDaoImplementation();
        Group group = groupDaoImplementation.getByGroupNumber("IT-noAcademy");
        assertNull(group);
    }
    @Test
    public void groupExistsByNumber() throws SQLException, IOException {
        GroupDaoImplementation groupDaoImplementation = new GroupDaoImplementation();
        Group group = groupDaoImplementation.getByGroupNumber("IT-Academy-2");
        assertNotNull(group);
    }

}