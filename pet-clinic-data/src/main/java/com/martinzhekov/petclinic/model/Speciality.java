package com.martinzhekov.petclinic.model;

import lombok.*;

import javax.persistence.Entity;

/**
 * Created by martinzhekov on 13.05.20
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "specialties")
public class Speciality extends BaseEntity{

    private String description;

}
