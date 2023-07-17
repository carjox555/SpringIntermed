package com.project.cochesIntermed.domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Dto de un Cliente
 */

public class CustomerDto {
    private String cardId;
    private String fullName;
    private String email;
    private  Double numberCellphone;
    private Integer active;
    private String password;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getNumberCellphone() {
        return numberCellphone;
    }

    public void setNumberCellphone(Double numberCellphone) {
        this.numberCellphone = numberCellphone;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
