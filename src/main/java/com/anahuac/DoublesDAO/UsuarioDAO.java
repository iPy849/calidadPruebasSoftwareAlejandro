package com.anahuac.DoublesDAO;

public interface UsuarioDAO {
    public int agregarUsuario(Usuario usuario);
    public boolean borrarUsuario(Usuario usuario);
    public boolean actualizarUsuario(Usuario usuario);
    public Usuario buscarPorNombre(String nombre);
}
