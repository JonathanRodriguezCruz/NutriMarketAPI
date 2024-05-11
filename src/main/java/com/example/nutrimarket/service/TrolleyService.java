package com.example.nutrimarket.service;

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

}
