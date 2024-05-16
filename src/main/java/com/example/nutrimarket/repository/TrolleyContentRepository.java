package com.example.nutrimarket.repository;

import com.example.nutrimarket.model.TrolleyContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrolleyContentRepository extends JpaRepository<TrolleyContent, Integer> {
    @SuppressWarnings({"null"})
    TrolleyContent findByCarritoId(int id);

    @Query("SELECT product_id FROM contenido_carrito WHERE carrito_id = ?1")
    List<Integer> findAllProductIdByTrolleyId(int trolleyId);

    void deleteByProductIdAndCarritoId(int idProduct, int idTrolley);

    @SuppressWarnings({"null", "unchaked"})
    TrolleyContent save(TrolleyContent trolleyContent);
}
