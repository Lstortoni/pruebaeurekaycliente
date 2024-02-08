package com.citycode.animalEurekaservice.service;

import com.citycode.animalEurekaservice.model.Animal;

import java.util.List;

public interface IAnimalService {

    public Animal getAnimal (Long id);

    public List<Animal> getAnimals();

}
