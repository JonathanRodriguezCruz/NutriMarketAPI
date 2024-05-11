package com.example.nutrimarket.controller;

import com.example.nutrimarket.DTO.TrolleyContentDTO;
import com.example.nutrimarket.model.TrolleyContent;
import com.example.nutrimarket.service.TrolleyContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contenido")
public class TrolleyContentController {
    @Autowired
    TrolleyContentService trolleyContentService;

    @GetMapping("/carrito/{id}")
    public TrolleyContent getTrolleyById(@PathVariable int id) {
        return trolleyContentService.getTrolleyById(id);
    }

    @GetMapping("/cliente/{id}")
    public TrolleyContent getTrolleyByUserId(@PathVariable int id) {
        return trolleyContentService.getTrolleyByUserId(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTrolleyProduct(@PathVariable int id) {
        trolleyContentService.deleteProduct(id);
    }

    @PostMapping
    public TrolleyContent addProductTrolley(@RequestBody TrolleyContentDTO trolleyContentDTO) {
        return trolleyContentService.addProduct(trolleyContentDTO);
    }

    @PutMapping("/update/{id}")
    public TrolleyContent updateProductTrolley(@RequestBody TrolleyContentDTO trolleyContentDTO) {
        return trolleyContentService.updateTrolleyContent(trolleyContentDTO);
    }
}
