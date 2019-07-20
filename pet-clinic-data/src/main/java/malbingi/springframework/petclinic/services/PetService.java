package malbingi.springframework.petclinic.services;

import malbingi.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save (Pet owner);
    Set<Pet> findAll();
}
