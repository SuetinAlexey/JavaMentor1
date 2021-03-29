package pkghw;

import bounds.Animal;
import bounds.Cat;
import bounds.HomeCat;
import bounds.WildCat;

import java.util.ArrayList;
import java.util.List;

public class Wildcard_1 {

    public static void main(String[] args){

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal());

        //print(animalList);
        //printWild(animalList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        catList.add(new HomeCat("Филя"));
        catList.add(new WildCat("Багира"));
        //print(catList);
        printWild(catList);

    }

    private static void print(List<Animal> animalList){  // пролезут только Animal. Внутри можно расширять список.
        animalList.forEach(System.out::println);
    }

    private static void printWild(List<? extends Animal> animalList) { // пролезут Animal и наследнии. Расширять список нельзя
        animalList.forEach(System.out::println);
    }

}
