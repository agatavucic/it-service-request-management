package com.itservicerequest.model;

public class User {
    private int userID;
    private String username;
    private String password;
    private Role role;

    public User(int id, String username, String password, Role role) {
        this.userID = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }
}
