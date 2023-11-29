package ru.netology.autorizationservice.model;

import jakarta.validation.constraints.NotBlank;

public class User {
    @NotBlank
    private String name;
    @NotBlank
    private String password;
    private Authorities[] authorities;
    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User(String name, String password, Authorities[] authorities) {
        this.name = name;
        this.password = password;
        this.authorities = authorities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
