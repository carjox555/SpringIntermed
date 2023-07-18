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
    @MapsId(value = "purchaseNumberBill")  //a nivel de backend
    @JoinColumn(name = "compras_numero_factura",insertable = false,updatable = false)
    private PurchaseEntity purchaseEntity;

    @ManyToOne
    @JoinColumn(name = "compras_numero_factura",insertable = false,updatable = false)

    public Integer getQuantity() {
        return quantity;
    }
}
