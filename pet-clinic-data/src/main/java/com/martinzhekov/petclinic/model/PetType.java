package com.martinzhekov.petclinic.model;

import lombok.*;

import javax.persistence.Entity;

/**
 * Created by martinzhekov on 12.05.20
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "types")
public class PetType extends BaseEntity{
    private String name;

    @Builder
    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
