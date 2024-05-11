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

    public TrolleyContent getTrolleyById(int id) {
        return trolleyContentRepository.findByCarritoId(id);
    }

    public TrolleyContent getTrolleyByUserId(int id) {
        return trolleyContentRepository.findByUserId(id);
    }

    public TrolleyContent addProduct(TrolleyContentDTO trolleyContentDTO) {
        TrolleyContent trolleyContent = new TrolleyContent();

        if (trolleyContentDTO != null) {
            trolleyContent.setCarritoId(trolleyContentDTO.getCarritoId());
            trolleyContent.setUserId(trolleyContentDTO.getUserId());
            trolleyContent.setProductId(trolleyContentDTO.getProductId());
            trolleyContent.setProductCant(trolleyContentDTO.getProductCant());
        }

        return trolleyContentRepository.save(trolleyContent);
    }

    public void deleteProduct(int id) {
        trolleyContentRepository.deleteByProductId(id);
    }

    public TrolleyContent updateTrolleyContent(TrolleyContentDTO trolleyContentDTO) {
        TrolleyContent trolleyContent = new TrolleyContent();

        if (trolleyContentDTO != null) {
            trolleyContent.setCarritoId(trolleyContentDTO.getCarritoId());
            trolleyContent.setUserId(trolleyContentDTO.getUserId());
            trolleyContent.setProductId(trolleyContentDTO.getProductId());
            trolleyContent.setProductCant(trolleyContentDTO.getProductCant());
        }

        return trolleyContentRepository.save(trolleyContent);
    }

}
