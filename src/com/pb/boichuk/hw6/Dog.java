package com.pb.boichuk.hw6;

import java.util.Objects;

public class Dog extends Animal {
    //public String food = "едаСобака";
    //public String location = "локацияСобака";
    public boolean isGuardian;
    public String getName(){
        return "Dog";
    }
    public void makeNoise(){
        System.out.println("гав!");
    }
    public void eat(){
        System.out.println("кость");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return isGuardian == dog.isGuardian;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isGuardian);
    }

    public Dog() {
        food = "едаСобака";
        location = "локацияСобака";
    }
}
