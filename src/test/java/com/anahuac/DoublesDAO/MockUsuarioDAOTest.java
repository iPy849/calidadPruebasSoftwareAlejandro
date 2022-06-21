package com.anahuac.DoublesDAO;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class MockUsuarioDAOTest {

    private MockUsuarioDAO mockUsuarioDAO;

    @Test
    public void MockUsuarioDAO_AgregarUsuario_Test() {
        // TODO: Terminar testing de CRUD
        // when(mockUsuarioDAO.agregarUsuario()).
    }

    @After
    public void tearDown() throws Exception {
        
    }

    @Before
    public void setUp() throws Exception {
        mockUsuarioDAO = Mockito.mock(MockUsuarioDAO.class);
        
    }
}
