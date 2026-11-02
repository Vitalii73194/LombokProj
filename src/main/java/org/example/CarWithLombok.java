package org.example;

import lombok.*;

@Data
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class CarWithLombok {

    @EqualsAndHashCode.Include
    private String model;

    @EqualsAndHashCode.Include
    private String brand;

    private int year;
    private int price;
    private String color;
    private int quantity;
}