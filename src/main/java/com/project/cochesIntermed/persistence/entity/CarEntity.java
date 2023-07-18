package com.project.cochesIntermed.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "coches")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_coche")
    private Integer codeCar;

    @Column(name = "marca_coche_od")
    private Integer brandCarId;
    @Column(name = "referencia")
    private String reference;
    @Column(name = "precio")
    private Double price;
    @Column(name = "anio_modelo")
    private Double modelYear;

    private String color;
    @Column(name = "numero_caballos_fuerza")
    private Double horsepower;

    @Column(name = "numero_puertas")
    private Double numberDoor;

    @Column(name = "cilindraje")
    private Double engineDisplacement;

    @Column(name = "transmision")
    private String transmission;

    @Column(name = "tipo_combstible")
    private String fuelType;

    @Column(name = "traccion")
    private Integer traction;

    @Column(name = "numero_asientos")
    private Integer numberSeats;

    @Column(name = "direccion")
    private String steering;

    @Column(name = "categoria")
    private String category;

    @Column(name = "ruta_imagen")
    private String imagePath;

    @ManyToOne
    @JoinColumn(name = "marca_coche_id", insertable= false, updatable = false)
    private BrandCarEntity brandCarEntity;

    @OneToMany (mappedBy = "carEntity")
    private List<CarPurchaseEntity> carPurchaseEntity;

}
