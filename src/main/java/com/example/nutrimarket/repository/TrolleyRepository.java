package com.example.nutrimarket.repository;

import com.example.nutrimarket.model.Product;
import com.example.nutrimarket.model.Trolley;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrolleyRepository extends JpaRepository<Trolley, Integer> {
    List<Trolley> findAll();

    Trolley findByTrolleyId(int id);

    Trolley save(Trolley trolley);

    void deleteById(int id);
}
