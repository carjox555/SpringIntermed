package com.project.cochesIntermed.persistence.repository;

import com.project.cochesIntermed.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICustomerCrudRepository extends JpaRepository<CustomerEntity, String> {

    //Esto es un Query method osea @Query("select * from customer where email=$email")

    //Esto es un metodo adicional
    Optional<CustomerEntity>findByEmailCustomer(String email);
}
