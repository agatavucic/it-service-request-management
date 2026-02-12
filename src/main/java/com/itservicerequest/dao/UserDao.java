package com.itservicerequest.dao;

import com.itservicerequest.db.Database;
import com.itservicerequest.model.Role;
import com.itservicerequest.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

    public User findByUsername(String username) throws SQLException {
        String sql = "SELECT id, username, password, role FROM users WHERE username = ?";

        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, username);

            try (ResultSet rs = ps.executeQuery()) {
                if (!rs.next()) {
                    return null;
                }

                int id = rs.getInt("id");
                String dbUsername = rs.getString("username");
                String password = rs.getString("password");
                String roleStr = rs.getString("role");

                Role role = Role.valueOf(roleStr); // USER / SERVICER

                return new User(id, dbUsername, password, role);
            }
        }
    }
}
