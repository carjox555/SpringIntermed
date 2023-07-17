package com.project.cochesIntermed.domain.dto;

import lombok.Getter;
import lombok.Setter;

/*
Dto que modela un coche
 */
@Getter @Setter
public class CarDto {
    private Integer codeCar;
    private Integer brandCarId;
    private String referencia;
    private Double price;
    private Double modelYear;
    private String color;
    private Double horsepower;
    private Double numberDoor;
    private Double engineDisplacement;
    private String transmission;
    private String fuelType;
    private Integer traction;
    private Integer numberSeats;
    private String steering;
    private String category;
    private String imagePath;

}