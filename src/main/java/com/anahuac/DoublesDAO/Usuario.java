package com.anahuac.DoublesDAO;

public class Usuario {
    private int id;
    private String username, password, tipo, email;

    public Usuario(int id, String username, String password, String tipo, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.tipo = tipo;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
