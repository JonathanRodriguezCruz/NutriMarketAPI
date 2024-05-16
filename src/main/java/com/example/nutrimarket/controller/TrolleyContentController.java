package com.example.nutrimarket.controller;

import com.example.nutrimarket.DTO.TrolleyContentDTO;
import com.example.nutrimarket.model.TrolleyContent;
import com.example.nutrimarket.service.TrolleyContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contenido")
public class TrolleyContentController {
    @Autowired
    TrolleyContentService trolleyContentService;

    @GetMapping("/{id}")
    public List<Integer> getAllProductsOfTrolley(@PathVariable int id) {
        return trolleyContentService.getAllProductsOfTrolley(id);
    }

    @DeleteMapping("/delete/productId-trolleyId")
    public void deleteProductOfTrolley(@RequestParam("productId") int idProduct, @RequestParam("trolleyId") int idTrolley) {
        trolleyContentService.deleteProduct(idProduct, idTrolley);
    }

    @PostMapping
    public TrolleyContent addProductTrolley(@RequestBody TrolleyContentDTO trolleyContentDTO) {
        return trolleyContentService.addProduct(trolleyContentDTO);
    }

    @PutMapping("/update/{id}")
    public TrolleyContent updateProductOfTrolley(@PathVariable int id, @RequestBody TrolleyContentDTO trolleyContentDTO) {
        return trolleyContentService.updateTrolleyContentCant(id, trolleyContentDTO);
    }
}
