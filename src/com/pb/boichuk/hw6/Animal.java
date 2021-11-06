package com.pb.boichuk.hw6;

public class Animal {
    public String food;
    public String location;

    public String getName(){
        return "животное";
    }
    public void makeNoise(){}
    public void eat(){}
    public void sleep(){
        System.out.println(getName() + "спит...");
    }
}
