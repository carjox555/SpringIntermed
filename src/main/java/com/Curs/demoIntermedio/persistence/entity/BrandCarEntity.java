package com.Curs.demoIntermedio.persistence.entity;

import jakarta.persistence.*;

/**
 * Entidad marca coche
 */
@Entity
@Table(name = "marca_coche")
public class BrandCarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "descripcion")
    private String description;
}
