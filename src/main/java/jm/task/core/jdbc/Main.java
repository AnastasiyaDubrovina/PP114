package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.createUsersTable();
        userServiceImpl.saveUser("Ivan", "Aaa", (byte) 12);
        userServiceImpl.saveUser("Olga", "Bbb", (byte) 87);
        userServiceImpl.saveUser("Nikolay", "Ccc", (byte) 38);
        userServiceImpl.saveUser("Petr", "Ddd", (byte) 21);
        userServiceImpl.removeUserById(2);
        List<User> users = userServiceImpl.getAllUsers();
        for (User u : users) {
            System.out.println(u);
        }
        userServiceImpl.cleanUsersTable();
        userServiceImpl.dropUsersTable();
    }
}
