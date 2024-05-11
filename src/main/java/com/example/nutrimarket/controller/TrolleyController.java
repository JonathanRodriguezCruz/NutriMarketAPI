package com.example.nutrimarket.controller;

import com.example.nutrimarket.DTO.TrolleyDTO;
import com.example.nutrimarket.model.Trolley;
import com.example.nutrimarket.service.TrolleyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Trolley getTrolley(@PathVariable int id) {
        return trolleyService.getTrolley(id);
    }

    @PostMapping
    public Trolley createTrolley(@RequestBody TrolleyDTO trolleyDTO) {
        return trolleyService.createTrolley(trolleyDTO);
    }

    @PutMapping("/update/{id}")
    public Trolley updateTrolley(@PathVariable int id, @RequestBody TrolleyDTO trolleyDTO) {
        return trolleyService.updateTrolley(id,trolleyDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTrolley(@PathVariable int id) {
        trolleyService.deleteTrolleyById(id);
    }

}
