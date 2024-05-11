package com.example.nutrimarket.service;

import com.example.nutrimarket.DTO.TrolleyDTO;
import com.example.nutrimarket.model.Trolley;
import com.example.nutrimarket.repository.TrolleyRepository;
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
public class TrolleyService {
    @Autowired
    TrolleyRepository trolleyRepository;

    public List<Trolley> getAllTrolley() {
        return trolleyRepository.findAll();
    }

    public Trolley getTrolley(int id) {
        return trolleyRepository.findByTrolleyId(id);
    }

    public void deleteTrolleyById(int id) {
        trolleyRepository.deleteById(id);
    }

    public Trolley createTrolley(TrolleyDTO trolleyDTO) {
        Trolley trolley = new Trolley();

        if (trolleyDTO != null) {
            trolley.setUserId(trolleyDTO.getUserId());
        }

        return trolleyRepository.save(trolley);
    }

    public Trolley updateTrolley(int id, TrolleyDTO trolleyDTO) {
        Trolley trolley = trolleyRepository.findByTrolleyId(id);

        if (trolleyDTO != null) {
            trolley.setUserId(trolleyDTO.getUserId());
        }

        return trolleyRepository.save(trolley);
    }
}
