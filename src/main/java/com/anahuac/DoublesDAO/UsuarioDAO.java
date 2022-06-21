package com.anahuac.DoublesDAO;

public interface UsuarioDAO {
    public boolean agregarUsuario(Usuario usuario);
    public boolean borrarUsuario(Usuario usuario);
    public boolean actualizarUsuario(Usuario usuario);
    public Usuario buscarPorNombre(String nombre);
}
