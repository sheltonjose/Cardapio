package com.example.Cardapio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cardapio.FoodRepository;
import com.example.Cardapio.entity.Food;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;
    
    @GetMapping
    public List<Food> getAll(){

    List<Food> foodlist= foodRepository.findAll();
    return foodlist;
        

    }


}
