package com.example.ex.Animal;
import java.util.HashMap;
import java.util.Map;

public enum TypeAnimal {

    WOLF(1), RABBIT("");

    private  double weight;

    private  double saturation;

    private  int speed;

    private  String imageAnimal;

    private  Map<TypeAnimal, Integer> diet = new HashMap<TypeAnimal, Integer>();


    TypeAnimal(String i){
        weight = 2;

        saturation = 0.45;

        speed = 2;

        imageAnimal = "\ud83d\udc30";
    }
    TypeAnimal(int i){
        weight = 50;

        saturation = 8;

        speed = 3;

        imageAnimal = "\uD83D\uDC3A";
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

    public String getImagineAnimal() {
        return imageAnimal;
    }

    public Map<TypeAnimal, Integer> getDiet() {
        return diet;
    }

}
