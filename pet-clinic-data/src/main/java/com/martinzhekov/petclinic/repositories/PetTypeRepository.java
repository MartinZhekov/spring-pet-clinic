package com.martinzhekov.petclinic.repositories;


import com.martinzhekov.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by martinzhekov on 15.05.20
 */


public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
