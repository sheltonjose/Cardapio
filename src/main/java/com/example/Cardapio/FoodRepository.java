package com.example.Cardapio;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Cardapio.entity.Food;

public interface FoodRepository extends JpaRepository<Food,Long> {
    
    Food findByTitle(String title);



    


}
