package com.anahuac.DBUnit;

import com.anahuac.DoublesDAO.Usuario;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class UsuarioDAOMySQLTest {
    UsuarioDAOMySQL usuarioDAOMySQL;

    @Before
    public void setUp() throws Exception {
        usuarioDAOMySQL = new UsuarioDAOMySQL();
    }

    @After
    public void tearDown() throws Exception {
        
    }

    @Test
    public void UsuarioDAOMySQLTest_CanInsertANewUser_Test() {
        Usuario hardcodedUser = new Usuario(1, "iPy", "12345678", "User", "test@test.test");
        int insertedId = usuarioDAOMySQL.agregarUsuario(hardcodedUser);
        boolean result = insertedId != -1;
        assertThat(result, is(true));
    }
}
