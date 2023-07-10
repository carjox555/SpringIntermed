package com.project.cochesIntermed.domain.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Dto de un Cliente
 */
@Getter @Setter
public class CustomerDto {
    private String cardId;
    private String fullName;
    private String email;
    private  Double numberCellphone;
    private Integer active;
    private String password;
}
