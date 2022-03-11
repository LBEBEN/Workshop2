package pl.coderslab.entity;

public class UserDao {
    // create - utwórz
    private static final String CREATE_USER_QUERY = "INSERT INTO users(username, email, password) VALUES (?,?,?);";
    // read - wyświetl
    private static final String READ_FROM_DB_QUERY = "SELECT (id, username, email, password) FROM users;";
    // update - zaktualizuj
    private static final String UPDATE_USER_QUERY = "UPDATE users SET username = 'newUsername', email = 'newEmail', password = 'newPassword' WHERE id = ?";
    // delete - usuń
    private static final String DELETE_USER_QUERY = "DELETE FROM users WHERE id = ?";
}
