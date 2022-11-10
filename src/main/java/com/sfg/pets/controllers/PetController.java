package com.sfg.pets.controllers;

import com.sfg.pets.services.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String getActivePetType(){
        return petService.getPetType();
    }
}
