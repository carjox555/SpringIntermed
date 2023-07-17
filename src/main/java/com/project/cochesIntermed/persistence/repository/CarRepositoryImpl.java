package com.project.cochesIntermed.persistence.repository;

import com.project.cochesIntermed.domain.dto.CarDto;
import com.project.cochesIntermed.domain.repository.IntCarRepository;
import com.project.cochesIntermed.persistence.entity.CarEntity;
import com.project.cochesIntermed.persistence.mapper.mapper.IntCarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Repository
public class CarRepositoryImpl implements IntCarRepository {

    private IntCarCrudRepository intCarCrudRepository;
    private  IntCarMapper intCarMapper;
    @Override
    public List<CarDto> getAll() {
        return intCarMapper.toCarDtoList(intCarCrudRepository.findAll());
    }

    @Override
    public Optional<CarDto> getCar(Integer idCar) {
        return intCarCrudRepository.findById(idCar)
                .map(intCarMapper::toCarDto);
    }

    @Override
    public List<CarDto> getByIdBrandCar(Integer idBrandCar) {
        return intCarMapper.toCarDtoList(intCarCrudRepository.findAllByBrandCarId(idBrandCar));
    }

    @Override
    public List<CarDto> getCarsByPriceLessThan(Double price) {
        return intCarMapper.toCarDtoList(intCarCrudRepository.findAllByPriceLeesThan(price));

    }

    @Override
    public CarDto save(CarDto newCar) {
        return intCarMapper.toCarDto(intCarCrudRepository.save(intCarMapper.toCarEntity(newCar)));
    }

    @Override
    public void delete(Integer idCar) {
        intCarCrudRepository.deleteById(idCar);
    }
}
