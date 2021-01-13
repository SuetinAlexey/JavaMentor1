package pkghw;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Intro {

    public static void main(String[] args) {
        //new Intro().beforeGenerics();
        new Intro().generics();
    }

    private void beforeGenerics(){
        List list = new ArrayList();
        list.add(4.0);
        list.add(4L);
        list.add("HELLO");
        list.add(LocalTime.now());
        //
        ptintRow(list);
    }

    private void ptintRow(List list){
        for (Object item : list) {
            System.out.println(item);
        }
    }

    private void generics() {
        List<Integer> list = new ArrayList<>();
        //list.add(4.0);
        list.add(2);
        list.add(5);

        sumInt(list);
    }

    private void sumInt(List<Integer> list) {
        int summ = 0;
        for (int val : list) {
            summ += val;
        }
        System.out.println("\n summa "+ summ);
    }
}
