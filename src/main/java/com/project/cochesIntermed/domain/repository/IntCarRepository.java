package com.project.cochesIntermed.domain.repository;

import com.project.cochesIntermed.domain.dto.CarDto;
import com.project.cochesIntermed.domain.dto.CustomerDto;

import java.util.List;
import java.util.Optional;

public interface IntCarRepository {

    List<CarDto> getAll();

    //Optional para manejar los objetos nulos  (nullpointerException)
    Optional<CarDto> getCar(Integer idCar);

    List<CarDto>getByIdBrandCar(Integer idCar);

    List<CarDto>getCarsByPriceLessThan(Double price);

    CarDto save(CarDto newCar);


    void delete(Integer idCar);
}
