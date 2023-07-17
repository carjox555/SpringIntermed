package com.project.cochesIntermed.persistence.repository;

import com.project.cochesIntermed.domain.dto.CarDto;
import com.project.cochesIntermed.persistence.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IntCarCrudRepository extends JpaRepository<CarEntity,Integer> {

    List<CarEntity> findAllByBrandCarId(Integer id);

    List<CarEntity>findAllByPriceLeesThan(Double price);
}
