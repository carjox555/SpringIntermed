package com.project.cochesIntermed.domain.dto;

import java.time.LocalDateTime;
import java.util.List;

/*
Como entra= Dto del guardado de una compra
 */
public class PurchaseRequestDto {
    private Integer numberBill;
    private String cardIdCustomer;
    private LocalDateTime date;
    private Double total;
    private String paymentMethod;
    private List<CarPurchaseRequestDto>carsPurchase;
}
