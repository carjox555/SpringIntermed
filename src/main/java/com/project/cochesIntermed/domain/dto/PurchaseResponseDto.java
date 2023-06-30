package com.project.cochesIntermed.domain.dto;

import java.time.LocalDateTime;
import java.util.List;

public class PurchaseResponseDto {
    private Integer numberBill;
    private String cardIdCustomer;
    private LocalDateTime date;
    private Double total;
    private String typePayement;
    private List<CarPurchaseResponseDto> carsPurchase;
}
