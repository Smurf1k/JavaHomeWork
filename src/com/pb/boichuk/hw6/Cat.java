package com.pb.boichuk.hw6;

import java.util.Objects;

public class Cat extends Animal {
    //public String food = "едаКот";
    //public String location = "локацияКот";
    public String meowSound;

    public String getName(){
        return "Cat";
    }
    public void makeNoise(){
        System.out.println("meow!");
    }
    public void eat(){
        System.out.println("рыбу");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(meowSound, cat.meowSound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meowSound);
    }

    public Cat() {
        food = "едаКот";
        location = "локацияКот";
    }
}
