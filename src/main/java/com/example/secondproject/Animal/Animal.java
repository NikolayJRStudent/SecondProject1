package com.example.ex.Animal;

import java.util.Map;

public abstract class Animal {

    protected int location;

    protected double weight;

    protected   double saturation;

    protected   int speed;

    protected    String imageAnimal;

    protected Map<TypeAnimal, Integer> diet;

    public abstract void meal();

    public abstract void transfer();


    public int getLocation() {
        return location;
    }

    public double getWeight() {
        return weight;
    }

    public double getSaturation() {
        return saturation;
    }

    public int getSpeed() {
        return speed;
    }

    public String getImageAnimal() {
        return imageAnimal;
    }

    public Map<TypeAnimal, Integer> getDiet() {
        return diet;
    }
}
