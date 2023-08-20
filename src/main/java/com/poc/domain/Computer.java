package com.poc.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("computer")
@Getter
@Setter
public class Computer extends Devices {
    private String oS;

    @Builder
    public Computer(String brand, String name, String oS) {
        super(brand, name);
        this.oS = oS;
    }
}
