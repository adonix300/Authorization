package ru.netology.autorizationservice.model;

import jakarta.validation.constraints.NotBlank;

public class User {
    @NotBlank
    private String user;
    @NotBlank
    private String password;
    private Authorities[] authorities;

    public User() {
    }


    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public User(String user, String password, Authorities[] authorities) {
        this.user = user;
        this.password = password;
        this.authorities = authorities;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Authorities[] getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Authorities[] authorities) {
        this.authorities = authorities;
    }
}
