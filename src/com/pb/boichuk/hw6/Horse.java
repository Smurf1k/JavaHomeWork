package com.pb.boichuk.hw6;

import java.util.Objects;

public class Horse extends Animal {
    //public String food = "едаКонь";
    //public String location = "локацияКонь";
    public String colorMane;
    public String getName(){
        return "Horse";
    }
    public void makeNoise(){
        System.out.println("иго-го!");
    }
    public void eat(){
        System.out.println("яблоко");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(colorMane, horse.colorMane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colorMane);
    }

    public Horse() {
        food = "едаКонь";
        location = "локацияКонь";
    }
}
