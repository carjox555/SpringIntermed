package com.project.cochesIntermed.persistence.repository;

import com.project.cochesIntermed.persistence.entity.BrandCarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBrandCarCrudRepository extends JpaRepository<BrandCarEntity, Integer> {

}
