package com.example.menu.domain.food;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "foods")
@Entity(name = "foods")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String title;

    private String image;

    private Integer price;

    public Food(RequestFoodDTO requestFood){
        this.title = requestFood.title();
        this.image = requestFood.image();
        this.price = requestFood.price();
    }
}