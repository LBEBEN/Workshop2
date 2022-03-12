package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
         UserDao userDao = new UserDao();
         userDao.delete(2);
    }
}
