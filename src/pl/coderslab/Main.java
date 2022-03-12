package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        User user =new User();
        user.setUserName("Magdalena Mysłek");
        user.setEmail("Mag.Maslo@wp.pl");
        user.setPassword("Reto12");
        UserDao userDao = new UserDao();
        userDao.create(user);
    }
}
