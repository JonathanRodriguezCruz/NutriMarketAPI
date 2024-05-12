package com.example.nutrimarket.controller;

import com.example.nutrimarket.DTO.ClientDTO;
import com.example.nutrimarket.model.Client;
import com.example.nutrimarket.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Client getClient(@PathVariable int id) {
        return clientService.getClient(id);
    }

    @GetMapping("/email/{email}")
    public Client getClientByEmail(@PathVariable String email) {
        return clientService.getClientByEmail(email);
    }

    @GetMapping("/password/{password}")
    public Client getClientByEmailPassword(@PathVariable String password) {
        return clientService.getClientByPassword(password);
    }

    @DeleteMapping("/delete/{password}")
    public void deleteClient(@PathVariable String password) {
        clientService.deleteClient(password);
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody ClientDTO clientDTO) {
        return ResponseEntity.created(URI.create("/cliente/user_id")).body(clientService.createClient(clientDTO));
    }

    @PutMapping("/update/{id}")
    public void updateClient(@PathVariable int id, @RequestBody ClientDTO clientDTO) {
        clientService.updateClient(id,clientDTO);
    }
}
