package com.martinzhekov.petclinic.services.springdatajpa;


import com.martinzhekov.petclinic.model.Speciality;
import com.martinzhekov.petclinic.repositories.SpecialtyRepository;
import com.martinzhekov.petclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by martinzhekov on 15.05.20
 */


@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialtyService {
    private final SpecialtyRepository specialtyRepository;

    public SpecialitySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        this.specialtyRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return this.specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return this.specialtyRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        this.specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        this.specialtyRepository.deleteById(aLong);
    }
}
