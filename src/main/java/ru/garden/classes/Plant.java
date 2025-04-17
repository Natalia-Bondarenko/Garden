package ru.garden.classes;

import java.util.Scanner;

public class Plant {
    String type;
    String title;
    String placeOfLanding;
    String yearOfLanding;

    public void saveNewPlant() {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите тип растения: Цветок, Дерево, Куст");

        type = in.next();

        System.out.println("Введите название растения, например, 'Виноград', 'Смородина' и т.д.");
        title = in.next();
        System.out.println("Введите место посадки, например, 'Жуковский', 'Восточный' и т.д.");
        placeOfLanding = in.next();
        System.out.println("Введите дату посадки, например, '2025-03-20'");
        yearOfLanding = in.next();

        System.out.printf("Тип растения: " + type + "\n" +
                "Название растения: " + title + "\n" +
                "Место посадки: " + placeOfLanding + "\n" +
                "Дата посадки: " + yearOfLanding);

        in.close();
    }

}
