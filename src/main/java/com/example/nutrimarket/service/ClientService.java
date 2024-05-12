package com.example.nutrimarket.service;

import com.example.nutrimarket.DTO.ClientDTO;
import com.example.nutrimarket.model.Client;
import com.example.nutrimarket.repository.ClientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@Transactional(rollbackOn = Exception.class)
@RequiredArgsConstructor
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    public Client getClient(int id) {
        return clientRepository.findByUserId(id);
               /* .orElseThrow(( ) ->
                new RuntimeException("Cliente no encontrado.")
        );*/
    }

    public Client getClientByEmail(String email) {
        return clientRepository.findByUserEmail(email);
    }

    public Client getClientByPassword(String password) {
        return clientRepository.findByUserPassword(password);
    }

    public Client createClient(ClientDTO clientDTO) {
        Client client = new Client();

        if (clientDTO != null) {
            client.setUserEmail(clientDTO.getUserEmail());
            client.setUserPassword(clientDTO.getUserPassword());
            client.setUserName(clientDTO.getUserName());
            client.setUserDirect(clientDTO.getUserDirect());
        }

        return clientRepository.save(client);
    }

    public void deleteClient(String password) {
        clientRepository.deleteByUserPassword(password);
    }

    public void updateClient(int id, ClientDTO clientDTO) {
        Client client = clientRepository.findByUserId(id);

        if (clientDTO != null) {
            client.setUserName(clientDTO.getUserName());
            client.setUserPassword(clientDTO.getUserPassword());
            client.setUserEmail(clientDTO.getUserEmail());
            client.setUserDirect(clientDTO.getUserDirect());

            clientRepository.save(client);
        }
    }
}
