package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDaoJDBCImpl usJDBC = new UserDaoJDBCImpl();
    public void createUsersTable() {
        usJDBC.createUsersTable();
    }

    public void dropUsersTable() {
        usJDBC.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        usJDBC.saveUser(name,lastName,age);
    }

    public void removeUserById(long id) {
        usJDBC.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return usJDBC.getAllUsers();
    }

    public void cleanUsersTable() {
        usJDBC.cleanUsersTable();
    }
}