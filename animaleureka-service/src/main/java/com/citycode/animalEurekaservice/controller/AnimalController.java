package com.citycode.animalEurekaservice.controller;


import com.citycode.animalEurekaservice.model.Animal;
import com.citycode.animalEurekaservice.service.IAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private IAnimalService anServ;


    @GetMapping("/{animal_id}")
    public Animal getAnimalById(@PathVariable Long animal_id){

        return anServ.getAnimal(animal_id);
    }


    @GetMapping("/all")
    public List<Animal> getAll(){

        return anServ.getAnimals();
    }



}