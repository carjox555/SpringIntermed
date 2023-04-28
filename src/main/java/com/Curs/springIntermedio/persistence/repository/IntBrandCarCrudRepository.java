package com.Curs.springIntermedio.persistence.repository;

import com.Curs.springIntermedio.persistence.entity.BrandCarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntBrandCarCrudRepository extends JpaRepository<BrandCarEntity, Integer> {

}
