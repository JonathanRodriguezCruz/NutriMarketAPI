package com.example.nutrimarket;

import com.example.nutrimarket.model.Client;
import com.example.nutrimarket.service.ClientService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ClientServiceTests {
    @Mock
    ClientService clientService;

    private List<Client> clientList;
    private int id;
    private Client client;
    private String rol;
    private String email;
    private String password;

    @BeforeEach
     void setUp() {
        MockitoAnnotations.initMocks(this);

        clientList = new ArrayList<>();
        id = 5;
        client = new Client();
        rol = "cliente";
        email = "lucas@gmail.com";
        password = "admin1";
    }

    @Test
    @DisplayName("Comprueba si se obtienen todos los clientes")
    public void testGetAllClient(){
        when(clientService.getAll())
                .thenReturn(clientList);

        assertFalse(clientList.isEmpty());
    }

    @Test
    @DisplayName("Comprueba si se obtiene un cliente por su ID")
    public void testGetClientById(){
        when(clientService.getClient(id))
                .thenReturn(client);

        assertEquals(id, client.getUserId());
    }

    @Test
    @DisplayName("Comprueba si se obtiene un cliente por su rol")
    public void testGetClientByRol(){
        when(clientService.getClientByRol(rol))
                .thenReturn(clientList);

        assertFalse(clientList.isEmpty());
    }


    @Test
    @DisplayName("Comprueba si se obtiene un cliente por su email y su password")
    public void testLogin(){
        when(clientService.validLogIn(email, password))
                .thenReturn(client);

        assertNotNull(client);
    }
}
