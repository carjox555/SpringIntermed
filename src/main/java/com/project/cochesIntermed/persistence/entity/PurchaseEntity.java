package com.project.cochesIntermed.persistence.entity;

import com.project.cochesIntermed.domain.dto.CarPurchaseRequestDto;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Entity de compras
 */


@Entity
@Table(name = "compras")
public class PurchaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "numero_factura")
    private Integer numberBill;

    @Column(name = "cliente_cedula")
    private String cardIdCustomer;

    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime date;

    private Double total;

    @Column(name = "medio_pago")
    private String typePayement;

    @OneToMany(mappedBy = "purchaseEntity", cascade = {CascadeType.ALL})
    private List<CarPurchaseEntity> carsPurchase;
}
