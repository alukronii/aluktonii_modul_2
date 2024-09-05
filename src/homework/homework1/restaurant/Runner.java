package homework.homework1.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        ArrayList<String> monday = new ArrayList<>(List.of("Чебуречная №1", "Реберная", "Андерсон", "Ниппон", "Фо бо"));
        ArrayList<String> tuesday = new ArrayList<>(List.of("Вареничная №1", "Пушкин", "Чебуречная №1", "Ниппон", "Реберная"));
        ArrayList<String> wednesday = new ArrayList<>(List.of("Реберная", "Арарат", "Майя", "Ниппон", "Таксим"));
        ArrayList<String> thursday = new ArrayList<>(List.of("Грех", "Ваниль", "Реберная", "Пянсе", "Фо бо"));
        ArrayList<String> friday = new ArrayList<>(List.of("Бёрдс", "Реберная", "Андерсон", "Ниппон", "Чифанька"));

        ArrayList<Object> result = new ArrayList<>(monday);
        result.retainAll(tuesday);
        result.retainAll(wednesday);
        result.retainAll(thursday);
        result.retainAll(friday);
        System.out.println(result);
    }
}
