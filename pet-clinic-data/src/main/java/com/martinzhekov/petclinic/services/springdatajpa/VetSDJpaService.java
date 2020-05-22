package com.martinzhekov.petclinic.services.springdatajpa;


import com.martinzhekov.petclinic.model.Vet;
import com.martinzhekov.petclinic.repositories.VetRepository;
import com.martinzhekov.petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by martinzhekov on 15.05.20
 */

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();

        this.vetRepository.findAll().forEach(vets::add);

        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return this.vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return this.vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        this.vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        this.vetRepository.deleteById(aLong);
    }
}
