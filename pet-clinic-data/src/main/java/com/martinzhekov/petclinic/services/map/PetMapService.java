package com.martinzhekov.petclinic.services.map;


import com.martinzhekov.petclinic.model.Pet;
import com.martinzhekov.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by martinzhekov on 12.05.20
 */
@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object){
        return super.save(object);
    }

    @Override
    public void delete(Pet object){
        super.delete(object);
    }

    @Override
    public void deleteById(Long id){
        super.deleteById(id);
    }
}
