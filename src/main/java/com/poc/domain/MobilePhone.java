package com.poc.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("mobilephone")
@Getter
@Setter
public class MobilePhone extends Devices {
    private String color;

    @Builder
    public MobilePhone(String brand, String name, String color) {
        super(brand, name);
        this.color = color;
    }
}
