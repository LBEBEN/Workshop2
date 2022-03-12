package pl.coderslab.entity;

import pl.coderslab.DbUtil;

import java.sql.*;

public class UserDao {
    // create - utwórz
    private static final String CREATE_USER_QUERY = "INSERT INTO users(username, email, password) VALUES (?,?,?);";
    // read - wyświetl
    private static final String READ_FROM_DB_QUERY = "SELECT (id, username, email, password) FROM users;";
    // update - zaktualizuj
    private static final String UPDATE_USER_QUERY = "UPDATE users SET username = 'newUsername', email = 'newEmail', password = 'newPassword' WHERE id = ?";
    // delete - usuń
    private static final String DELETE_USER_QUERY = "DELETE FROM users WHERE id = ?";

    public String hashPassword(String password){
        return org.mindrot.jbcrypt.BCrypt.hashpw(password, org.mindrot.jbcrypt.BCrypt.gensalt());
    }

    public User create(User user) {
        try (Connection conn = DbUtil.ConnectionToWorkshop2()) {
            PreparedStatement statement = conn.prepareStatement(CREATE_USER_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getUserName());
            statement.setString(2, user.getEmail());
            statement.setString(3, hashPassword(user.getPassword()));
            statement.executeUpdate(); //Pobieramy wstawiony do bazy identyfikator, a następnie ustawiamy id obiektu user.

            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                user.setId(resultSet.getInt(1));
            }return user;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
