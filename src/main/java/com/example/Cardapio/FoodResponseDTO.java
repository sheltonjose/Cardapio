package com.example.Cardapio;

public record FoodResponseDTO(
    Long id,
    String title,
    String imageUrl,
    Integer price
) {
} 
