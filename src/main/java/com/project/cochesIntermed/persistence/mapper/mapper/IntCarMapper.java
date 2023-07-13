package com.project.cochesIntermed.persistence.mapper.mapper;

import com.project.cochesIntermed.domain.dto.CarDto;
import com.project.cochesIntermed.persistence.entity.CarEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IntCarMapper {

    CarDto toCarDto (CarEntity carEntity);

    @Mapping(target = "brandCarEntity",ignore = true)
    CarEntity toCarEntity(CarDto carDto);

    List<CarDto>toCarDtoList(List<CarEntity>carEntityList);
}
