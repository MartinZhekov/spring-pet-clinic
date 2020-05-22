package com.martinzhekov.petclinic.services;

import java.util.Set;

/**
 * Created by martinzhekov on 12.05.20
 */

public interface CrudService<T,ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
