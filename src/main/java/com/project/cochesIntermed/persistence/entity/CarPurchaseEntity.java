package com.project.cochesIntermed.persistence.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "coches_compras")
public class CarPurchaseEntity {
    /*
    Embebido llega de  CarPurchasePK
     */
    @EmbeddedId
    private CarPurchasePK id;

    @Column(name = "cantidad")
    private Integer quantity;

    private Integer total;

    @ManyToOne
    private PurchaseEntity purchaseEntity;

    public Integer getQuantity() {
        return quantity;
    }
}
