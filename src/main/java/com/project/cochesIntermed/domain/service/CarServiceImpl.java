package com.project.cochesIntermed.domain.service;

import com.project.cochesIntermed.domain.dto.CarDto;
import com.project.cochesIntermed.domain.repository.IntCarRepository;
import com.project.cochesIntermed.domain.useCase.IcarUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class CarServiceImpl implements IcarUseCase {

    private final IntCarRepository intCarRepository;
    @Override
    public List<CarDto> getAll() {
        return intCarRepository.getAll();
    }


    @Override
    public List<CarDto> getByIdBrandCar(Integer idBrandCar) {
        return intCarRepository.getByIdBrandCar(idBrandCar);
    }

    @Override
    public List<CarDto> getCarsByPriceLessThan(Double price) {
        return intCarRepository.getCarsByPriceLessThan(price);
    }
    @Override
    public Optional<CarDto> getCar(Integer idCar) {
        return intCarRepository.getCar(idCar);
    }

    @Override
    public CarDto save(CarDto newCar) {
        return intCarRepository.save(newCar);
    }

    @Override
    public boolean delete(Integer idCar) {
        if(intCarRepository.getCar(idCar).isEmpty()){
            return false;
        }intCarRepository.delete(idCar);
        return true;
    }
}
