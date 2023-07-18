package com.project.cochesIntermed.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Entidad de un Cliente
 */
@Getter @Setter
@Entity
@Table (name = "cliente")


public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cedula")
    private String cardId;
    @Column(name = "nombre")
    private String fullName;
    @Column(name = "email")
    private String email;
    @Column(name = "numero_celular")
    private  Double numberCellphone;
    @Column(name = "activo")
    private Integer active;
    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "customerEntity")
    private List<PurchaseEntity> purchaseEntity;
}
