package com.example.Cardapio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Table(name = "foods")
@Entity
public class Food {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private String title;
    private String imageUrl;
    private Integer price;




}
