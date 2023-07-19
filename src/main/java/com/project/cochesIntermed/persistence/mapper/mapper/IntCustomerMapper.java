package com.project.cochesIntermed.persistence.mapper.mapper;

import com.project.cochesIntermed.domain.dto.CustomerDto;
import com.project.cochesIntermed.persistence.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper cliente
 */
@Mapper(componentModel = "spring")
public interface IntCustomerMapper {

    CustomerDto toCustomerDto (CustomerEntity customerEntity);

    @Mapping(target = "purchaseEntity" ,ignore = true)
    CustomerEntity toCustomerEntity(CustomerDto customerDto);

    List<CustomerDto> toCustomersDtoList(List<CustomerEntity> customerEntityList);
}
