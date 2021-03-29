package pkghw;

import bounds.HomeCat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args){

        Map<String, HomeCat> cats = new HashMap<>();
        for (int i = 0; i<1000; i++){
            String name = "cat"+i;
            cats.put(name, new HomeCat(name));
        }

        // заполняем коллекцию
        List<Integer> items = new ArrayList<>();
        for (int i=0; i<10; i++){
            items.add(i);
        }

        // обход коллекции
        for (Integer item : items){
            System.out.println(item);
        }

    }

}
