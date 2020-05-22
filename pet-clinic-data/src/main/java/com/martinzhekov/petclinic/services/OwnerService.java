package com.martinzhekov.petclinic.services;


import com.martinzhekov.petclinic.model.Owner;

import java.util.List;

/**
 * Created by martinzhekov on 12.05.20
 */

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

    //    "^[^a-zA-Z].*"
//    @Query("SELECT o FROM owners o WHERE o.lastName LIKE %?1%")
    List<Owner> findAllByLastNameLike(String lastName);
}
