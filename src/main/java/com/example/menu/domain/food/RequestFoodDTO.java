package com.example.menu.domain.food;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestFoodDTO(
        String id,
        @NotBlank String title,
        @NotBlank String image,
        @NotNull Integer price) {

}
