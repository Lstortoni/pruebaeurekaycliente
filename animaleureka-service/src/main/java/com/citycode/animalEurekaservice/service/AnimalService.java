package com.citycode.animalEurekaservice.service;


import com.citycode.animalEurekaservice.model.Animal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService implements  IAnimalService {
    @Override
    public Animal getAnimal(Long id) {

        Animal an = new Animal(1L, "Felino", "Tigre", "Muy fuerte", "Africa");


        return an;
    }

    @Override
    public List<Animal> getAnimals() {

        List<Animal> lista = new ArrayList<>();


        Animal an = new Animal(1L, "Felino", "Tigre", "Muy fuerte", "Africa");

        Animal an1 = new Animal(2L, "Felino", "Chica", "Muy Veloz", "Africa");

        Animal an2 = new Animal(3L, "Reptil", "Rana", "Sangre fria", "Africa");

        Animal an3 = new Animal(4L, "Mono", "Chimpance", "Agilidad", "Africa");

        lista.add(an);
        lista.add(an1);
        lista.add(an2);
        lista.add(an3);


        return lista;
    }
}