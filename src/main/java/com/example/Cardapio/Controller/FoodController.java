package com.example.Cardapio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.Cardapio.FoodRepository;
import com.example.Cardapio.FoodRequestDTO;
import com.example.Cardapio.FoodResponseDTO;
//import com.example.Cardapio.entity.Food;
import com.example.Cardapio.entity.Food;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;


    @CrossOrigin(origins = "#", allowCredentials = "#")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        foodRepository.save(foodData);
        return;
    }
    
    @CrossOrigin(origins = "#", allowCredentials = "#")
    @GetMapping
    public List<FoodResponseDTO> getAll(){

    List<FoodResponseDTO> foodlist= foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
    return foodlist;
        

    }


}
