package com.example.fshapp;

public class FshUsers {
    private String username;
    private String user_email;
    private String user_password;
    public FshUsers(String user, String email, String password) {
        this.username = user;
        this.user_email = email;
        this.user_password = password;
    }

    public FshUsers(String username, String user_password) {
        this.username = username;
        this.user_password = user_password;
    }

    public String getUsername() {
        return username;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
}
