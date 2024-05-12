package com.example.nutrimarket.repository;

import com.example.nutrimarket.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    @SuppressWarnings("null")
    List<Client> findAll();

    Client findByUserId(int id);

    Client findByUserEmail(String email);

    Client findByUserPassword(String password);

    void deleteByUserPassword(String pasword);

    @SuppressWarnings({"null", "unchaked"})
    Client save(Client client);
}
