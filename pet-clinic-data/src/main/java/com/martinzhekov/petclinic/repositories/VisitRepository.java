package com.martinzhekov.petclinic.repositories;


import com.martinzhekov.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by martinzhekov on 15.05.20
 */


public interface VisitRepository extends CrudRepository<Visit, Long> {
}
