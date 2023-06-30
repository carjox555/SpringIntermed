package com.project.cochesIntermed.persistence.mapper.mapper;

import com.project.cochesIntermed.domain.dto.BrandCarDto;
import com.project.cochesIntermed.persistence.entity.BrandCarEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper que transforma objetos de marcaCoche a pojos o entidades
 */
@Mapper (componentModel = "spring")
public interface IntBrandCarMapper {

    /**
     * Convierte una entidad a un pojo de marca coche
     * @param marcaEntity Entidad a convertir
     * @return Pojo convertido
     */
    @Mapping(source="id", target = "id")
    @Mapping(source="description", target = "description")
    BrandCarDto toMarcaCochePojo(BrandCarEntity marcaEntity);
    /**
     * Convierte un pojo a una entidad de marca coche
     * @param marcaPojo Pojo a convertir
     * @return Entity convertido
     */
    @InheritInverseConfiguration  //viceversa del anterior
    BrandCarEntity toMarcaCocheEntity (BrandCarDto marcaPojo);


    /**
     * Retorna una lista de marcas coches transformada a pojo de una lista de entidades
     * @param marcasCocheEntity Entidad a transformar
     * @return lista transformada
     */
    List<BrandCarDto> toMarcasCochePojo(List<BrandCarEntity>marcasCocheEntity);


}