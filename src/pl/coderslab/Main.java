package pl.coderslab;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try (Connection connection = DbUtil.ConnectionToWorkshop2()){

        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
