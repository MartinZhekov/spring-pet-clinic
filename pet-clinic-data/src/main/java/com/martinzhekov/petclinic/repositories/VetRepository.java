package com.martinzhekov.petclinic.repositories;


import com.martinzhekov.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by martinzhekov on 15.05.20
 */


public interface VetRepository extends CrudRepository<Vet, Long> {
}
