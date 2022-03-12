package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
         UserDao userDao = new UserDao();
        System.out.println(userDao.read(4));
        System.out.println("");
        userDao.findAll();
    }
}
