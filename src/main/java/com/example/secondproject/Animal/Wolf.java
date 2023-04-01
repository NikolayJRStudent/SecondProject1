package com.example.ex.Animal;

import com.example.ex.Service.FindFieldService;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@Predator
public class Wolf extends Animal implements Runnable {

    private static int firstStepOneTimeVariable = 1;

    public Wolf() {
        weight = TypeAnimal.WOLF.getWeight();

        saturation = TypeAnimal.WOLF.getSaturation();

        speed = TypeAnimal.WOLF.getSpeed();

        imageAnimal = TypeAnimal.WOLF.getImagineAnimal();
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
            location = ThreadLocalRandom.current().nextInt(location - 3, location + 1);
            findFieldService.setField(this);
        } else if (location - 1 % 20 == 0) {
            location = ThreadLocalRandom.current().nextInt(location, location + 4);
            findFieldService.setField(this);
        } else if (location == 199 || location == 198) {

            location = (location == 199) ? ThreadLocalRandom.current().nextInt(location - 3, location + 2) : ThreadLocalRandom.current().nextInt(location - 3, location + 3);
            findFieldService.setField(this);
        } else if (randomStep == 0) {
            location = ThreadLocalRandom.current().nextInt(location - 3, location + 4);
            findFieldService.setField(this);
        } else if (randomStep == 1) {
            location = ThreadLocalRandom.current().nextInt(location - 23, location - 16);
            findFieldService.setField(this);
        } else if (randomStep == 2) {
            location = ThreadLocalRandom.current().nextInt(location - 43, location - 36);
            findFieldService.setField(this);
        } else if (randomStep == 3) {
            location = ThreadLocalRandom.current().nextInt(location - 63, location - 56);
            findFieldService.setField(this);
        } else if (randomStep == 4) {
            location = ThreadLocalRandom.current().nextInt(location + 17, location + 24);
            findFieldService.setField(this);
        } else if (randomStep == 5) {
            location = ThreadLocalRandom.current().nextInt(location + 37, location + 44);
            findFieldService.setField(this);
        } else if (randomStep == 6) {
            location = ThreadLocalRandom.current().nextInt(location + 57, location + 64);
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
