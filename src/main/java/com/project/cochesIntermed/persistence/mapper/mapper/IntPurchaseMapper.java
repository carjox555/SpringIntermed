package com.project.cochesIntermed.persistence.mapper.mapper;

import com.project.cochesIntermed.domain.dto.CustomerDto;
import com.project.cochesIntermed.domain.dto.PurchaseRequestDto;
import com.project.cochesIntermed.persistence.entity.CustomerEntity;
import com.project.cochesIntermed.persistence.entity.PurchaseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/*
Mapper de compras
 */
@Mapper(componentModel = "spring")
public interface IntPurchaseMapper {
    PurchaseRequestDto toPurchaseRequestDto (PurchaseEntity purchaseEntity);

    @Mapping(target = "customerEntity" ,ignore = true)
    PurchaseEntity toPurchaseEntity(PurchaseRequestDto purchaseRequestDto);

    List<PurchaseRequestDto> toPurchsesDto(List<PurchaseEntity> purchaseEntyList);
}