package com.poc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "devices")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "device")
@Getter
@Setter
@AllArgsConstructor
public class Devices extends BaseDO {
    private String brand;
    private String name;
}
