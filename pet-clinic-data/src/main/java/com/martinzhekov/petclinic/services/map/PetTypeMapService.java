package com.martinzhekov.petclinic.services.map;


import com.martinzhekov.petclinic.model.PetType;
import com.martinzhekov.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by martinzhekov on 13.05.20
 */

@Service
@Profile({"default", "map"})
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
            super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
            super.deleteById(id);
    }
}
