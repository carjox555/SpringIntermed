package com.project.cochesIntermed.domain.dto;

import java.time.LocalDateTime;
import java.util.List;
/*
Dto de la consulta de los carros de una compra
 */

public class PurchaseResponseDto {
    private Integer numberBill;
    private String cardIdCustomer;
    private LocalDateTime date;
    private Double total;
    private String typePayement;
    private List<CarPurchaseResponseDto> carsPurchase;
}
