package pkghw;

import bounds.Animal;
import bounds.Cat;
import bounds.HomeCat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardPECS {

    public static void main(String[] args){
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal());
        printConsumer(animalList); // работает

        //

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        //printProducer(catList); // работает
        //printConsumer(catList); // работает
        //

        List<HomeCat> homeCat = new ArrayList<>();
        homeCat.add(new HomeCat("Филя"));

        //

    }

    private static void printProducer(List<? extends Cat> catList){ // Cat и наследники.
        // любое добавление в catList запрещено
        //catList.add(new Object()); //Ошибка
        //catList.add(new Animal()); //Ошибка
        //catList.add(new Cat()) //Ошибка
        //catList.add(new HomeCat("f")); //Ошибка

        List<? extends Cat> catList2 = Arrays.asList(new Cat(), new HomeCat("Филя")); // массив
        //catList.addAll(catList2);

        catList.forEach(System.out::println);
    }

    private static void printConsumer(List<? super Cat> catList){
        catList.add(new Cat());
        catList.add(new HomeCat("Филя"));
        catList.forEach(System.out::println);

        Object item = catList.get(0);
        System.out.println("item from the list:" + item);
    }

}
