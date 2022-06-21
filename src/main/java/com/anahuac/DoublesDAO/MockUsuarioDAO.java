package com.anahuac.DoublesDAO;

public class MockUsuarioDAO implements  UsuarioDAO{

    public boolean agregarUsuario(Usuario usuario) {
        return false;
    }

    public boolean borrarUsuario(Usuario usuario) {
        return false;
    }

    public boolean actualizarUsuario(Usuario usuario) {
        return false;
    }

    public Usuario buscarPorNombre(String nombre) {
        return null;
    }
}
