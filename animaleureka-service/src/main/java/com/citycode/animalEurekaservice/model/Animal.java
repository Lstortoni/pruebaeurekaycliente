package com.citycode.animalEurekaservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    private Long id;
    private  String type;
    private  String name;
    private String features;
    private String country;
}



