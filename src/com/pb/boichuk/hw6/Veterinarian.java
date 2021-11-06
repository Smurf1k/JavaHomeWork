package com.pb.boichuk.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.println(animal.getName() + " которое ест " + animal.food + " обитает в " + animal.location);
    }
}
