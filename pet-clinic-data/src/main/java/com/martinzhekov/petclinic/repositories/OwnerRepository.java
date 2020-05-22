package com.martinzhekov.petclinic.repositories;

import com.martinzhekov.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by martinzhekov on 15.05.20
 */


public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

////    "^[^a-zA-Z].*"
//    @Query("SELECT o FROM owners o WHERE o.lastName LIKE %?1%")
    List<Owner> findAllByLastNameLike(String lastName);

}
