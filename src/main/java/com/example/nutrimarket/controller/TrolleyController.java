package com.example.nutrimarket.controller;

import com.example.nutrimarket.model.Trolley;
import com.example.nutrimarket.service.TrolleyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carrito")
public class TrolleyController {
    @Autowired
    TrolleyService trolleyService;

    @GetMapping
    public List<Trolley> getAllTrolley() {
        return trolleyService.getAllTrolley();
    }
}
