package com.example.nutrimarket.service;

import com.example.nutrimarket.DTO.TrolleyContentDTO;
import com.example.nutrimarket.model.TrolleyContent;
import com.example.nutrimarket.repository.TrolleyContentRepository;
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
public class TrolleyContentService {
    @Autowired
    TrolleyContentRepository trolleyContentRepository;

    /**
     * Muestra el contenido de un carrito dado su 'id'.
     *
     * @param id    Id del carrito.
     *
     * @return  Lista del contenido del carrito.
     */
    /* [fix] */
    public TrolleyContent getTrolleyById(int id) {
        return trolleyContentRepository.findByCarritoId(id);
    }

    public List<Integer> getAllProductsOfTrolley(int trolleyId) {
        return trolleyContentRepository.findAllProductIdByTrolleyId(trolleyId);
    }

    /**
     * Agregar un nuevo producto al carrito.
     *
     * @param trolleyContentDTO Objeto que contiene la información sobre el producto,carrito, cliente y la cantidad.
     *                          .
     * @return  Contenido agregado al carrito.
     */
    public TrolleyContent addProduct(TrolleyContentDTO trolleyContentDTO) {
        TrolleyContent trolleyContent = new TrolleyContent();

        if (trolleyContentDTO != null) {
            trolleyContent.setCarritoId(trolleyContentDTO.getCarritoId());
            trolleyContent.setProductId(trolleyContentDTO.getProductId());
            trolleyContent.setProductCant(trolleyContentDTO.getProductCant());
        }

        return trolleyContentRepository.save(trolleyContent);
    }

    /**
     * Elimina un producto contrceto de un carrito concreto.
     *
     * @param idProduct Id del prodycto.
     * @param idTrolley Id del carrito.
     */
    public void deleteProduct(int idProduct, int idTrolley) {
        trolleyContentRepository.deleteByProductIdAndCarritoId(idProduct, idTrolley);
    }

    /**
     * Modifica la cantidad de un producto en concreto.
     *
     * @param id                Id del carrito.
     * @param trolleyContentDTO Objeto que contiene todos lo datos modificados.
     *
     * @return  Contenido del carrito modificado.
     */
    public TrolleyContent updateTrolleyContentCant(int id, TrolleyContentDTO trolleyContentDTO) {
        TrolleyContent trolleyContent = getTrolleyById(id);

        if (trolleyContentDTO.getProductCant() > 0) {
            trolleyContent.setProductCant(trolleyContentDTO.getProductCant());
        }

        return trolleyContentRepository.save(trolleyContent);
    }

}
