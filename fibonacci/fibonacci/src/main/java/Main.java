import java.util.HashMap;

public class Main {

    static HashMap<Integer, Long> cache = new HashMap<Integer, Long>();
    static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            long fib = fibonacci(n - 1) + fibonacci(n - 2);
            cache.put(n, fib);
            return fib;
        }
    }


    public static void main(String[] args) {

        System.out.printf("Hello and Welcome");

        for (int i = 0; i <= 100; i++) {
            long fib = fibonacci(i);
            System.out.println("Fib i = " + i + " = " + fib);
        }

    }
}
