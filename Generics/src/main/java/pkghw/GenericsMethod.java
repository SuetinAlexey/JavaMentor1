package pkghw;

public class GenericsMethod {

    public static void main(String[] args) {
        GenericsMethod genericsMethod = new GenericsMethod();
        //
        genericsMethod.print(1, "Value 1");
        genericsMethod.print(1, "Value 2");
    }

    private <K, V> void print(K key, V val) {
        System.out.println("key: " + key + "val: " + val);
    }

}
