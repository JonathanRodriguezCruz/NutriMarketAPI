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
    public Client getClientById(@PathVariable int id) {
        return clientService.getClient(id);
    }

    @GetMapping("/rol")
    public Client getClientByRol(@RequestParam(name = "rol", defaultValue = "cliente") String rol) {
        return clientService.getClientByRol(rol);
    }

    @GetMapping("/email-password")
    public Client getClientByEmailPassword(@RequestParam(name = "userEmail")String email, @RequestParam(name = "userPassword")String password) {
        return clientService.getClientByEmailPassword(email, password);
    }

    @DeleteMapping("/delete/{password}")
    public void deleteClient(@PathVariable String password) {
        clientService.deleteClientByPassword(password);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClient(@PathVariable int id) {
        clientService.deleteClientById(id);
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody ClientDTO clientDTO) {
        return ResponseEntity.created(URI.create("/cliente/user_id")).body(clientService.createClient(clientDTO));
    }

    @PutMapping("/update/{id}")
    public Client updateClient(@PathVariable int id, @RequestBody ClientDTO clientDTO) {
        return clientService.updateClient(id,clientDTO);
    }
}
