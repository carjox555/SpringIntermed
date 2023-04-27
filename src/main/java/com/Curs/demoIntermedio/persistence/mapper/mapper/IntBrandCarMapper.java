package com.Curs.demoIntermedio.persistence.mapper.mapper;

import com.Curs.demoIntermedio.domain.pojo.BrandCarPojo;
import com.Curs.demoIntermedio.persistence.entity.BrandCarEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper (componentModel = "spring")
public interface IntBrandCarMapper {

    /**
     * Convierte una entidad a un pojo de marca coche
     * @param marcaEntity Entidad a convertir
     * @return Pojo convertido
     */
    @Mapping(source="id", target = "id")
    @Mapping(source="description", target = "description")
    BrandCarPojo toMarcaCochePojo(BrandCarEntity marcaEntity);

    /**
     * Convierte un pojo a una entidad de marca coche
     * @param marcaPojo Pojo a convertir
     * @return Entity convertido
     */
    @InheritInverseConfiguration
    BrandCarEntity toMarcaCocheEntity (BrandCarPojo marcaPojo);


    /**
     * Retorna una lista de marcas coches transformada a pojo de una lista de entidades
     * @param marcacocheEntity Entidad a transformar
     * @return lista transformada
     */
    List<BrandCarPojo> toMacasCochePojo(List<BrandCarEntity>marcacocheEntity);


}
