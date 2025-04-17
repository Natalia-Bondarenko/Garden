package ru.garden;

import ru.garden.classes.Plant;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Garden!");

        Plant plant = new Plant();

        plant.saveNewPlant();

    }
}