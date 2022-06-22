package com.anahuac.DBUnit;

import com.anahuac.DoublesDAO.Usuario;
import com.anahuac.DoublesDAO.UsuarioDAO;

import java.sql.*;

public class UsuarioDAOMySQL implements UsuarioDAO {
    public Connection getConnectionMySQL() {

        Connection con = null;
        try {
            // Establish the driver connector
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Set the URI for connecting the MySql database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbunit", "root", "123456");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    @Override
    public int agregarUsuario(Usuario a) {
        Connection connection = getConnectionMySQL();
        int id = -1;
        try {
            // Declare statement query to run
            PreparedStatement preparedStatement;
            preparedStatement = connection
                    .prepareStatement("insert INTO usuarios(username,password,email,tipo) values(?,?,?,?)",
                            Statement.RETURN_GENERATED_KEYS);
            // Set the values to match in the ? on query
            preparedStatement.setString(1, a.getUsername());
            preparedStatement.setString(2, a.getPassword());
            preparedStatement.setString(3, a.getEmail());
            preparedStatement.setString(4, a.getTipo());

            // Return the result of connection nad statement
            if (preparedStatement.executeUpdate() >= 1) {
                ResultSet rs = preparedStatement.getGeneratedKeys();
                if (rs.next()){
                    id = rs.getInt(1);
                }
            }
            System.out.println("\n");
            System.out.println("Usuario añadido con exito");
            System.out.println(">> Return: " + id + "\n");
            // Close connection with the database
            connection.close();
            preparedStatement.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        // Return statement
        return id;
    }

    @Override
    public boolean borrarUsuario(Usuario usuario) {
        return false;
    }

    @Override
    public boolean actualizarUsuario(Usuario usuario) {
        return false;
    }

    @Override
    public Usuario buscarPorNombre(String nombre) {
        return null;
    }

}
