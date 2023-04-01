package com.example.ex.Animal;

import com.example.ex.Service.FindFieldService;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@Herbivore
public class Rabbit extends Animal implements Runnable{
    private static int firstStepOneTimeVariable = 1;

    public Rabbit() {
        weight = TypeAnimal.RABBIT.getWeight();

        saturation = TypeAnimal.RABBIT.getSaturation();

        speed = TypeAnimal.RABBIT.getSpeed();

        imageAnimal = TypeAnimal.RABBIT.getImagineAnimal();
    }

    @Override
    public void meal() {

    }

    @Override
    public void transfer() {
        FindFieldService findFieldService = new FindFieldService();

        int randomStep = ThreadLocalRandom.current().nextInt(0, 7);
        int firstStep = firstStepOneTimeVariable;

        if (firstStep == 1) {
            firstStepOneTimeVariable++;
            location = ThreadLocalRandom.current().nextInt(201);
            findFieldService.setField(this);
        } else if (location % 20 == 0) {
            location = ThreadLocalRandom.current().nextInt(location - 2, location + 1);
            findFieldService.setField(this);
        } else if (location - 1 % 20 == 0) {
            location = ThreadLocalRandom.current().nextInt(location, location + 3);
            findFieldService.setField(this);
        } else if (location == 199 || location == 198) {

            location = (location == 199) ? ThreadLocalRandom.current().nextInt(location - 2, location + 2) : ThreadLocalRandom.current().nextInt(location - 2, location + 3);
            findFieldService.setField(this);
        } else if (randomStep == 0) {
            location = ThreadLocalRandom.current().nextInt(location - 2, location + 3);
            findFieldService.setField(this);
        } else if (randomStep == 1) {
            location = ThreadLocalRandom.current().nextInt(location - 22, location - 17);
            findFieldService.setField(this);
        } else if (randomStep == 2) {
            location = ThreadLocalRandom.current().nextInt(location - 42, location - 37);
            findFieldService.setField(this);
        } else if (randomStep == 3) {
            location = ThreadLocalRandom.current().nextInt(location - 62, location - 57);
            findFieldService.setField(this);
        } else if (randomStep == 4) {
            location = ThreadLocalRandom.current().nextInt(location + 18, location + 23);
            findFieldService.setField(this);
        } else if (randomStep == 5) {
            location = ThreadLocalRandom.current().nextInt(location + 38, location + 43);
            findFieldService.setField(this);
        } else if (randomStep == 6) {
            location = ThreadLocalRandom.current().nextInt(location + 58, location + 63);
            findFieldService.setField(this);
        }


    }

    @Override
    public void run() {

        while (true) {

            transfer();
            try {
                Thread.sleep(1, TimeUnit.SECONDS.ordinal());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

