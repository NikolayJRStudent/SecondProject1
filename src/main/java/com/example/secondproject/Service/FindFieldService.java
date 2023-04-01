package com.example.ex.Service;
import com.example.ex.HelloController;
import com.example.ex.Animal.Animal;
import com.example.ex.Field.Field;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.List;

public class FindFieldService {

    private static final FunctionalInterface<Field> functionalInterface = ()->{
        ArrayList<Field> arrayList = new ArrayList<>();
        for (int i = 1; i <= 200; i++) {
            arrayList.add(new Field(i));
        }

        return arrayList;
    };
    private final List<Field> allField;
    public FindFieldService(){

        allField = functionalInterface.cycle();
    }


    public  void setField(Animal animal){
        allField.get(animal.getLocation()-1).setListAnimals(animal);

    }

}
