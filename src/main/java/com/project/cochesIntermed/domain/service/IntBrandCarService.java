package com.project.cochesIntermed.domain.service;

import com.project.cochesIntermed.domain.dto.BrandCarDto;

import java.util.List;
import java.util.Optional;

public interface IntBrandCarService {
    //Metodos

    /**
     * Devuelve una lista con todas las marcas de los coches
     * @return lista con marcas dee coches
     */
    List<BrandCarDto> getAll();

    /**
     * Devuelve una marca de coche por id
     * @param id Id de marca coche
     * @return una marca de coche encontrada
     */
    //Optional para manejar los objetos nulos  (nullpointerException)
    Optional<BrandCarDto> getBrandCar(Integer id);

    /**
     * Guarda una nueva marca coche
     * @param newBrandCar marca coche guardar
     * @return marca de coche guardada
     */
    BrandCarDto save(BrandCarDto newBrandCar);

    /**
     * Actualiza marca coche
     * @param newBrandcar marca coche a actualizar
     * @return marca coche actualizada
     */
    Optional<BrandCarDto> update( BrandCarDto newBrandcar);

    /**
     * Elimina una marca coche dado su id
     * @param idBrandCar id de marca coche a eliminar
     */
    Boolean delete(Integer idBrandCar);
}
