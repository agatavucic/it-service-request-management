package com.itservicerequest.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbSeed {

    public static void seed() throws SQLException {
        String sql = "INSERT OR IGNORE INTO users(username, password, role) VALUES (?, ?, ?)";

        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            // Test USER
            ps.setString(1, "user1");
            ps.setString(2, "pass1");
            ps.setString(3, "USER");
            ps.executeUpdate();

            // Test SERVICER
            ps.setString(1, "servicer1");
            ps.setString(2, "pass1");
            ps.setString(3, "SERVICER");
            ps.executeUpdate();
        }
    }
}
