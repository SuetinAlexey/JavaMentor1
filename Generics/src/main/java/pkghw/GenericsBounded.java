package pkghw;

import bounds.Cat;
import bounds.HomeCat;
import bounds.WildCat;

public class GenericsBounded<T extends Cat> {

    public static void main(String[] args) {
        //
        GenericsBounded<Cat> cat = new GenericsBounded<>();
        GenericsBounded<HomeCat> hc = new GenericsBounded<>();
        GenericsBounded<WildCat> mc = new GenericsBounded<>();
        //
        cat.add( new Cat());
        cat.add( new HomeCat("Barsik"));
        cat.add( new WildCat("Lion"));
        //
        hc.add( new HomeCat("Barsik"));
        //hc.add( new Cat());


    }

    public void add(T item) {
        //
    }


}
