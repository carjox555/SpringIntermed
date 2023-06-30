package com.project.cochesIntermed.persistence.entity;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "coches_compras")
public class CarPurchaseEntity {

    @EmbeddedId
    private CarPurchasePK id;
    private Integer quantity;
    private Integer total;

    @ManyToOne
    private PurchaseEntity purchaseEntity;
}
