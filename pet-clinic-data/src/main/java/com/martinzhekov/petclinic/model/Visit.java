package com.martinzhekov.petclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

/**
 * Created by martinzhekov on 13.05.20
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "visits")
public class Visit extends BaseEntity{

    private LocalDate date;

    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }
}
