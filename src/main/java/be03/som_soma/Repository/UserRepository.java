package be03.som_soma.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import be03.som_soma.Model.MainUser;

public class UserRepository {
    public void addUser(MainUser user) {
        String sql = "INSERT INTO users (firstName, lastName, email) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getFirstName());
            pstmt.setString(2, user.getLastName());
            pstmt.setString(3, user.getEmail());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public MainUser getUserById(int id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        MainUser user = null;

        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                user = new MainUser(rs.getString("firstName"), rs.getString("lastName"), rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public void insertUser(MainUser user) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        String sql = "INSERT INTO users (firstName, lastName, email) VALUES (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getFirstName());
        statement.setString(2, user.getLastName());
        statement.setString(3, user.getEmail());
        statement.executeUpdate();
        connection.close();
    }
}
