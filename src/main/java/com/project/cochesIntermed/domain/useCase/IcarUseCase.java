package com.project.cochesIntermed.domain.useCase;

import com.project.cochesIntermed.domain.dto.CarDto;

import java.util.List;
import java.util.Optional;

public interface IcarUseCase {

    List<CarDto> getAll();

    //Optional para manejar los objetos nulos  (nullpointerException)
    Optional<CarDto> getCar(Integer idCar);

    List<CarDto>getByIdBrandCar(Integer idCar);

    /*
    Retorna carros que son de menor precio
     */
    List<CarDto>getCarsByPriceLessThan(Double price);

    CarDto save(CarDto newCar);


    boolean delete(Integer idCar);
}
