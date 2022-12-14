package com.sfg.pets.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dog", "default"})
public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Dog pet type";
    }
}
