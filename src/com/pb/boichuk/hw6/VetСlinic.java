package com.pb.boichuk.hw6;

import com.pb.boichuk.hw3.Array;

public class VetСlinic {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Horse()};
        for (Animal animal : animals){
            veterinarian.treatAnimal(animal);
        }
    }
}
