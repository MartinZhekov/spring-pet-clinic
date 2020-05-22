package com.martinzhekov.petclinic.repositories;


import com.martinzhekov.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by martinzhekov on 15.05.20
 */


public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
