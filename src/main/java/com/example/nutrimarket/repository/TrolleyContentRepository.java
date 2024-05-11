package com.example.nutrimarket.repository;

import com.example.nutrimarket.model.TrolleyContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrolleyContentRepository extends JpaRepository<TrolleyContent, Integer> {
    TrolleyContent findByCarritoId(int id);

    TrolleyContent findByUserId(int id);

    TrolleyContent save(TrolleyContent trolleyContent);

    void deleteByProductId(int id);
}
