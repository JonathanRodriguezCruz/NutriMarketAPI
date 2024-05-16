package com.example.nutrimarket.repository;

import com.example.nutrimarket.model.Trolley;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrolleyRepository extends JpaRepository<Trolley, Integer> {
    Trolley findByTrolleyId(int id);

    Trolley findByUserId(int id);

    void deleteById(int id);

    @SuppressWarnings({"null", "unchaked"})
    Trolley save(Trolley trolley);
}
