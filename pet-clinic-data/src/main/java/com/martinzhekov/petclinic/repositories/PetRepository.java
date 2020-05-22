package com.martinzhekov.petclinic.repositories;

import com.martinzhekov.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by martinzhekov on 15.05.20
 */


public interface PetRepository extends CrudRepository<Pet, Long> {
}
