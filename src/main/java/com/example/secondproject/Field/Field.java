package com.example.ex.Field;

import com.example.ex.Animal.Animal;
import com.example.ex.HelloController;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Field {
    HelloController helloController = new HelloController();
    ArrayList<Label> allLabel = helloController.getAllLabel();

    private final int numField;

    private int numGrass;

    private ArrayList<Animal> listAnimals = new ArrayList<>();

    public Field(int numField) {

        this.numField = numField;
        numGrass = ThreadLocalRandom.current().nextInt(10);
    }

    public void outputAnimals() throws InterruptedException {
        String outputAnimals = "";

        for (int i = 0; i < listAnimals.size(); i++) {
            outputAnimals+=listAnimals.get(i).getImageAnimal();
        }

        allLabel.get(numField).setText(outputAnimals);
        listAnimals.clear();
        Thread.sleep(800);
        allLabel.get(numField).setText("");
    }

    public void setListAnimals(Animal animal)  {
        listAnimals.add(animal);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            outputAnimals();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
