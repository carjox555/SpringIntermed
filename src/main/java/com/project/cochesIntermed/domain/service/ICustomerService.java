package com.project.cochesIntermed.domain.service;

import com.project.cochesIntermed.domain.dto.CustomerDto;
import com.project.cochesIntermed.domain.dto.ResponseCustomerDto;

import java.util.List;
import java.util.Optional;

/**
 * Interface de servicio repository
 */

public interface ICustomerService {
    /**
     * Devuelve una lista con todas las marcas de los coches
     * @return lista con marcas dee coches
     */
    List<CustomerDto> getAll();

    /**
     * Devuelve una marca de coche por id
     * @param cardId de cliente
     * @return una marca de coche encontrada
     */
    //Optional para manejar los objetos nulos  (nullpointerException)
    Optional<CustomerDto> getCustomerByCardId(String cardId);



    Optional<CustomerDto> getCustomerByEmail(String email);
    /**
     * Guarda un cliene por su email
     * @param newCustomer
     * @return marca de
     */
    ResponseCustomerDto save(CustomerDto newCustomer);

    Optional<CustomerDto>update(CustomerDto modifyCustomer);

    /**
     * Elimina una marca cliente dado su id
     * @param cardId id de cliente
     */
    boolean delete(String cardId);
}
