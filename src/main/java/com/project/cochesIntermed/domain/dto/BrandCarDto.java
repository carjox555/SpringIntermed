package com.project.cochesIntermed.domain.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Pojo de marca coche
 */

public class BrandCarDto {

    private Integer id;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
