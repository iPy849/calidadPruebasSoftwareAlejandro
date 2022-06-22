package com.anahuac.DoublesDAO;

public class MockUsuarioDAO implements  UsuarioDAO{

    public int agregarUsuario(Usuario usuario) {
        return 0;
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
