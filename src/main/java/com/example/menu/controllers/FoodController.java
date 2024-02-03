package com.example.menu.controllers;

import com.example.menu.domain.food.Food;
import com.example.menu.domain.food.FoodRepository;
import com.example.menu.domain.food.RequestFoodDTO;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public ResponseEntity getALLFoods(){
        var allFoods = repository.findAll();
        return ResponseEntity.ok(allFoods);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity registerFoods(@RequestBody @Valid RequestFoodDTO data){
        Food newProduct = new Food(data);
        repository.save(newProduct);
        return ResponseEntity.ok().build();
    }
}
