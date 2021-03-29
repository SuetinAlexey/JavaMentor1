package pkghw;

import bounds.Cat;

import java.util.ArrayList;
import java.util.List;

public class Wildcard_2 {

    public static void main(String[] args){

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());

        printObj(catList);

        for (Cat cat : catList) {
            if (cat instanceof Cat) {
                System.out.println(cat.getMyau());
            }
        }
    }

    public static void printWild(List<?> animalList){  // Может пролезть все что угодно но добавлять в список нельзя
        //animalList.add(new Cat());  ошибка на этапе компилиции
        animalList.forEach(System.out::println);
    }

    public static void printObj(List animalList){  // Так писать нельзя. Пролазит все что угодно. Если добавить в списк - будет ошибка на этапе исполнения.
        //animalList.add("Внезапно добавленная строка.");
        animalList.forEach(System.out::println);
    }
}
