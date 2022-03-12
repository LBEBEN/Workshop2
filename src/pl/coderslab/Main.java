package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
         User user =new User();
         UserDao userDao = new UserDao();
         user.setUserName("Clark Kent");
         user.setEmail("C.Kent@daylyplanet.com");
         user.setPassword("I'mnotSuperman");
         userDao.create(user);
    }
}
