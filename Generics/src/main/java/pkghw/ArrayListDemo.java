package pkghw;

import bounds.Animal;
import bounds.Cat;
import bounds.HomeCat;
import bounds.WildCat;
import java.util.List;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args){

        Cat[] animalArr = new Cat[]{new HomeCat("Мурзик"), new HomeCat("Васька")};
        //
        List<Cat> animalList = Arrays.asList(animalArr); // asList - возвращает List, который нельзя модифицировать.
        //
        System.out.println(animalList);
        //
        animalArr[0] = new HomeCat("Багирчик");
        System.out.println(animalList);

       //animalList.add(new HomeCat("Филя")); // в animalList ничего добавлять нельзя

        System.out.println("-----------------");
        Animal[] catsArr = animalList.toArray(new Animal[0]);     // непонятный массив. Не разобрался.
        System.out.println("catsArr ="+Arrays.toString(catsArr));

        System.out.println(" Копирование ");
        List<? super Cat> animalListDest = new ArrayList<>(animalList);
        Collections.copy(animalListDest, animalList);
        System.out.println("Home cats "+ animalListDest);

        System.out.println(" Убрать дубли ");
        List<String> strDoubl = Arrays.asList("1","2","2","3");
        System.out.println("strDoubl "+strDoubl);
        Set<String> strDoublFiltered = new HashSet<>(strDoubl);
        System.out.println("strDoublFiltered "+strDoublFiltered);

        // заполняем коллекцию
        List<Integer> items = new ArrayList<>(); //new ArrayList<>();
        for (int i=0; i<10; i++){
            items.add(i);
        }

        // обход коллекции
        for (Integer item : items){
            System.out.println(item);
        }





    }

}
